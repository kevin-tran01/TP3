package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList tab_etudiants;

    public Departement(String specialite, String adresse, ArrayList tab_etudiants) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.tab_etudiants = tab_etudiants;
    }

    public String toString(){

    }


}
