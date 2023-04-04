package org.example.Salarie;

public class Salarie {
    public int Matricule;
    public int categorie;
    public String Service;
    public String Nom;
    public double Salaire;

    public Salarie(String nom, double salaire) {
        Nom = nom;
        Salaire = salaire;
    }

    public void AfficheSalaire(){
        System.out.println("le salaire de "+Nom+" est de "+Salaire);
    }
}
