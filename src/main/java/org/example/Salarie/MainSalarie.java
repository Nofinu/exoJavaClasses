package org.example.Salarie;

import java.util.Scanner;

public class MainSalarie {
    public static void main() {
        Salarie[] tab = {new Salarie("toto", 2000), new Salarie("titi", 2200), new Salarie("tata", 3000), new Salarie("tutu", 2500),new Commercial("com1",1800,54000,10)};

        Scanner s = new Scanner(System.in);
        int entry = 0;
        String nom;

        do {
            afficher();
            entry = s.nextInt();
            switch (entry){
                case 1:
                    tab = ajouterEmploye(tab);
                    break;
                case 2:
                    afficherSalaire(tab);
                    break;
                case 3:
                    System.out.println("entrer le nom de l'employé :");
                    nom = s.next();
                    afficherEmploye(tab,nom);
                    break;
            }

        }while (entry != 0);
    }

    public static void afficher(){
        System.out.println("---------menu-------------");
        System.out.println("1-Ajouter un employé");
        System.out.println("2-Afficher les salaires des employés");
        System.out.println("3-Rechercher un employé");
        System.out.println("0-Quitter");
        System.out.println("---------------------");
    }

    public static void afficherSalaire( Salarie[] tab ){
        double totalSalaire =0;
        System.out.println("le nombre de salariés : " + Salarie.cptSalarie);
        for (Salarie employe:tab) {
            System.out.println("le salaire fixe de "+employe.Nom+" est de "+employe.Salaire+" euros");
            totalSalaire += employe.Salaire;
        }
        System.out.println("le montant total de salaire mensuel est de "+totalSalaire);
        Salarie.changeCpt(1);
        System.out.println("le nombre de salariés : " + Salarie.cptSalarie);
    }

    public static Salarie[] ajouterEmploye(Salarie[] tab){
        int entry;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("-----------ajouter employé-------------");
            System.out.println("1-Employé");
            System.out.println("2-Comercial");
            entry = s.nextInt();
        }while(entry<1 || entry > 2);

        return addEmploye(tab,entry);

    }

    public  static Salarie[] addEmploye(Salarie[] tab, int type){
        String nom;
        double salaire;
        Scanner s = new Scanner(System.in);
        System.out.println("entre le nom de l'employé :");
        nom = s.next();
        System.out.println("entrer le salaire de l'employé : ");
        salaire = s.nextDouble();

        Salarie[] tabActualiser = new Salarie[tab.length+1];
        for (int i = 0; i <tab.length ; i++) {
            tabActualiser[i]=tab[i];
        }
        if(type == 1){
            tabActualiser[tab.length] = new Salarie(nom,salaire);
        }
        else{
            double Ca;
            int commistion;
            System.out.println("entre le CHiffre d'affaire de l'employé :");
            Ca = s.nextDouble();
            System.out.println("entrer la commition de l'employé : ");
            commistion = s.nextInt();
            tabActualiser[tab.length] = new Commercial(nom,salaire,Ca,commistion);
        }

        return tabActualiser;
    }

    public static void afficherEmploye(Salarie[] tab,String nom){
        boolean find = false;
        for (Salarie employe:tab) {
            if(employe.Nom.equals(nom)){
                System.out.println("le salaire fixe de "+employe.Nom+" est de "+employe.Salaire+" euros");
                find = true;
                break;
            }
        }
        if(!find){
            System.out.println("aucun employe trouver avec le nom : "+nom);
        }
    }
}
