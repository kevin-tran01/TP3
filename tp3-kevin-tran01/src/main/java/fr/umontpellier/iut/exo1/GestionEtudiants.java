package fr.umontpellier.iut.exo1;


import java.time.LocalDate;

public class GestionEtudiants {
    public static void main(String[] args) {
      Etudiant lolo = new Etudiant("lolo", "kevin", LocalDate.of(2002,04,28),"zegbsgdfvq@gmail.com", "25 rue des mimosas");
        System.out.println(lolo.toString());
       Etudiant toto = lolo;
        System.out.println(lolo==toto);

    }
}
