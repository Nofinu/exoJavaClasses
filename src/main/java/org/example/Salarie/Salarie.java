package org.example.Salarie;

import org.example.Salarie.Adress.Adress;

public class Salarie {
    static int cptSalarie =0;
    public String Nom;
    public double Salaire;

    public Adress adresse;

    public Salarie() {
    }

    public Salarie(String nom, double salaire,int numero,String rue,int codePostal) {
        Nom = nom;
        Salaire = salaire;
        cptSalarie++;
        adresse = new Adress(numero,rue,codePostal);
    }

    public void AfficheSalaire(){
        System.out.println("le salaire de "+Nom+" est de "+Salaire);
    }

    public static void changeCpt (int value){
        cptSalarie = value;
    }

}
