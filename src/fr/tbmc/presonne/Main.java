package fr.tbmc.presonne;

import java.util.*;

/**
 * Created by tbmc on 13/03/2017.
 */
public class Main {

    public static void main(String[] args) {

        Personne
                p1 = createPersonne("n1", "p1", 1996, 1, 26),
                p2 = createPersonne("nom", "prenom", 2001, 7, 23),
                p3 = createPersonne("eiprjg", "iojdgfs", 67, 4, 5),
                p4 = createPersonne("n1", "p1", 1996, 1, 26);

        Set<Personne> pp1 = new TreeSet<>();
        pp1.add(p1); pp1.add(p2); pp1.add(p3);
        pp1.add(p4);


        afficherPersonnes(pp1);
        // Collections.reverse(pp1);
        afficherPersonnes(pp1);
        // Collections.shuffle(pp1);
        afficherPersonnes(pp1);

    }

    public static void afficherPersonnes(Collection<Personne> personnes) {
        Iterator<Personne> it = personnes.iterator();
        Personne p;
        for(; it.hasNext();) {
            p = it.next();
            System.out.println(p);
        }
        System.out.println();
    }

    public static Personne createPersonne(String n, String p, int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return new Personne(n, p, c);
    }

}
