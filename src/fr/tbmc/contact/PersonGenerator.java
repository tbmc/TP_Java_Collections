package fr.tbmc.contact;

import fr.tbmc.presonne.Personne;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by tbmc on 14/03/2017.
 */
public class PersonGenerator {


    public static void generateXPersonnes(GestionnaireContacts g, int nbPersonnes) {
        for(int i = 0; i < nbPersonnes; i++) {
            ajouterPersonne(g,
                    randomString(5), randomString(7),
                    NumTel.TypeTel.PORTABLE, randomNum(10),
                    randomString(5), randomString(3),
                    random(0, 150), randomString(7),
                    random(10000, 100000), randomString(5)
            );
        }
    }

    public static void ajouterPersonne(
            GestionnaireContacts g,
            String nom, String prenom,
            NumTel.TypeTel typeTel, String numeroTel,
            String identifiant, String domain,
            int numero, String rue, int codepostal, String ville) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(random(0, 2017), random(0, 11), random(0, 30));
        Personne p = new Personne(nom, prenom, calendar);

        Contact c = new Contact(
                new NumTel(typeTel, numeroTel),
                new Email(identifiant, domain),
                new Mail(numero, rue, codepostal, ville)
        );

        g.ajouter(p, c);
    }

    public static int random(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static String randomStr(int min, int max, int size) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            char c = (char)(random.nextInt(max - min + 1) + min);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String randomString(int size) {
        return randomStr(97, 122, size);
    }

    public static String randomNum(int size) {
        return randomStr(48, 57, size);
    }

}
