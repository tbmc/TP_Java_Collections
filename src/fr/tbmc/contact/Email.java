package fr.tbmc.contact;

/**
 * Created by tbmc on 13/03/2017.
 */
public class Email {
    private String identifiant;
    private String domain;

    public Email(String identifiant, String domain) {
        this.identifiant = identifiant;
        this.domain = domain;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getDomain() {
        return domain;
    }

    @Override
    public String toString() {
        return identifiant + "." + domain;
    }

}
