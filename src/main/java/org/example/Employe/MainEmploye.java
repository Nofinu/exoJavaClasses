package org.example.Employe;

public class MainEmploye {
    public static void main() {
        Employe employe = new Employe("toto",35,1300);
        Technicien tech = new Technicien("titi",30,2000,2);

        employe.Afficher();
        tech.Afficher();

        employe.calculSalaire(50);
        tech.calculSalaire();

        employe.Afficher();
        tech.Afficher();
    }
}
