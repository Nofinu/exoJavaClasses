package org.example.ComptesBancaire;

import org.w3c.dom.ls.LSOutput;

public class mainCompte {


    public static void main() {
        ComptesSimples compte1 = new ComptesSimples(1500.2F,-200);
        CompteEpargne compte2 = new CompteEpargne(1800.28F,0.015F) ;
        ComptePayant compte3 = new ComptePayant(500.20F);

        compte1.Debit(1720);

        compte2.calculInteret();

        compte3.virment(200);

        System.out.println(compte1);
        System.out.println(compte2);
        System.out.println(compte3);
    }
}
