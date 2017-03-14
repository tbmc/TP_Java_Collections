package fr.tbmc.contact;

import fr.tbmc.presonne.Personne;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by tbmc on 14/03/2017.
 */
public class Main {

    private static GestionnaireContacts g = new GestionnaireContacts("Gestionnaire");

    public static void main(String[] args) {
        PersonGenerator.generateXPersonne(g, 10);

        System.out.println(g);
    }




}
