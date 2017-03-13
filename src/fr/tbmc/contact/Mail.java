package fr.tbmc.contact;

/**
 * Created by tbmc on 13/03/2017.
 */
public class Mail {

    private int numero;
    private int codepostal;
    private String rue;
    private String ville;

    public Mail(int numero, String rue, int codepostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codepostal = codepostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }
}
