package fr.tbmc.contact;

/**
 * Created by tbmc on 13/03/2017.
 */
public class Contact {

    private NumTel numTel;
    private Email email;
    private Mail mail;

    public Contact(NumTel numTel, Email email, Mail mail) {
        this.numTel = numTel;
        this.email = email;
        this.mail = mail;
    }

    public NumTel getNumTel() {
        return numTel;
    }

    public Email getEmail() {
        return email;
    }

    public Mail getMail() {
        return mail;
    }
}
