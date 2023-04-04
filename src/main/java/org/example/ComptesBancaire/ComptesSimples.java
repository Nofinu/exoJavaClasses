package org.example.ComptesBancaire;

public class ComptesSimples extends Comptes{
    private final float decouvert ;

    public ComptesSimples(float solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    public void Debit (float debit){
        if (super.getSolde()-debit>decouvert){
            super.setDebitSolde(debit);
        }
        else{
            System.out.println("fond insuffisant ...");
        }
    }
}
