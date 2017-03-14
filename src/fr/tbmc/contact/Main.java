package fr.tbmc.contact;

/**
 * Created by tbmc on 14/03/2017.
 */
public class Main {

    private static GestionnaireContacts g = new GestionnaireContacts("Gestionnaire");

    public static void main(String[] args) {
        PersonGenerator.generateXPersonnes(g, 10);

        System.out.println(g);
    }




}
