package org.example.ComptesBancaire;

public class CompteEpargne extends Comptes {
    private final float tauxInteret;

    public CompteEpargne(float solde, float tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public void calculInteret  (){
        float interet = super.getSolde()*(1+tauxInteret);
        super.setVirmentSolde(interet);
    }
}
