package fr.tbmc.contact;

import fr.tbmc.presonne.Personne;

import java.util.*;

/**
 * Created by tbmc on 13/03/2017.
 */
public class GestionnaireContacts {

    private Map<Personne, Contact> contacts = new HashMap<>();
    private String nom;

    public GestionnaireContacts(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public boolean ajouter(Personne p, Contact c) {
        contacts.put(p, c);
        return true;
    }

    public Contact contact(Personne p) {
        return contacts.get(p);
    }

    public boolean modifier(Personne p, Contact c) {
        contacts.put(p, c);
        return true;
    }

    public Set<Personne> personnes() {
        return contacts.keySet();
    }

    public Set<Personne> personnes(String prefix) {
        if(prefix == null || prefix.length() < 1) {
            return personnes();
        }
        Set<Personne> pSet = contacts.keySet(), out = new HashSet<>();
        for(Personne p : pSet) {
            if(p.getNom().indexOf(prefix) == 0) {
                out.add(p);
            }
        }
        return out;
    }

    public boolean supprimer(Personne p) {
        contacts.remove(p);
        return true;
    }


    public String personneToString(Personne p) {
        Contact c = contact(p);
        return p + "\n" + c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<Personne> pp = personnes();
        for(Personne p : pp) {
            sb.append(personneToString(p));
            sb.append("\n\n");
        }
        return sb.toString();
    }

}
