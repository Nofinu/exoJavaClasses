package org.example.Salarie;

public class Salarie {
    static int cptSalarie =0;
    public int Matricule;
    public int categorie;
    public String Service;
    public String Nom;
    public double Salaire;

    public Salarie() {
    }

    public Salarie(String nom, double salaire) {
        Nom = nom;
        Salaire = salaire;
        cptSalarie++;
    }

    public void AfficheSalaire(){
        System.out.println("le salaire de "+Nom+" est de "+Salaire);
    }

    public static void changeCpt (int value){
        cptSalarie = value;
    }

}
