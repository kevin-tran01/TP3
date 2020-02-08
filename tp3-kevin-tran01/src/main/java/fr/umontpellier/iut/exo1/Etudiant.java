package fr.umontpellier.iut.exo1;
import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private String adresse_mail;
    private String adresse_postale;

    public Etudiant(String nom, String prenom, LocalDate date_naissance, String adresse_mail, String adresse_postale) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.adresse_mail = adresse_mail;
        this.adresse_postale = adresse_postale;
    }

    public String toString(){

        return "Nom : " + nom + " \n Prénom : " + prenom + "\n Date de naissance : " +
                date_naissance + "\n Adresse Mail : " + adresse_mail +"\n Adresse :" + adresse_postale;

    }
    public void setNom(String nom){
        this.nom = nom;
    }



}