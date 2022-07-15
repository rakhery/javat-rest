package com.m2i.rest.lesson;

import java.util.ArrayList;
import java.util.List;

public class Annuaire {

    private List<Personne> personnes = new ArrayList<>();
    private long nextId = 1;

    public Personne addPersonne(Personne newPersonne) {
        newPersonne.setId(nextId);
        nextId++;
        personnes.add(newPersonne);
        return newPersonne;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public Personne getPersonne(long id) {
        for (Personne p : personnes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void updatePersonne(Personne personne) {

        for (Personne p : personnes) {
            if (p.getId().equals(personne.getId())) {
                personnes.remove(p);
                personnes.add(personne);
                break;
            }
        }
    }

    public void deletePersonne(long id) {
        for (Personne p : personnes) {
            if (p.getId().equals(id)) {
                personnes.remove(p);
                break;
            }
        }
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }

    public long getNextId() {
        return nextId;
    }

    public void setNextId(long nextId) {
        this.nextId = nextId;
    }
}