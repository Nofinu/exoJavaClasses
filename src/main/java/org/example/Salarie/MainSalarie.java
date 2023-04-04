package org.example.Salarie;

public class MainSalarie {
    public static void main() {
        double totalSalaire =0;
        Salarie[] tab = {new Salarie("toto", 2000), new Salarie("titi", 2200), new Salarie("tata", 3000), new Salarie("tutu", 2500)};

        System.out.println("le nombre de salariés : " + tab.length);
        for (Salarie employe:tab) {
            System.out.println("le salaire fixe de "+employe.Nom+" est de "+employe.Salaire+" euros");
            totalSalaire += employe.Salaire;
        }
        System.out.println("le montant total de salaire mensuel est de "+totalSalaire);
    }
}
