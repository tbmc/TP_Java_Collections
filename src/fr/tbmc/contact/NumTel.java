package fr.tbmc.contact;

/**
 * Created by tbmc on 13/03/2017.
 */
public class NumTel {

    public TypeTel getType() {
        return type;
    }

    public String getNumero() {
        return numero;
    }

    public static enum TypeTel {
      FIXEPROF, FIXEDOM, PORTABLE, FAX
    };

    private TypeTel type;
    private String numero;

    public NumTel(TypeTel type, String numero) {
        this.type = type;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "" + numero;
    }

}
