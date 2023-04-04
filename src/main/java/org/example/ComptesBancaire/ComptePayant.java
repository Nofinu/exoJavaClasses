package org.example.ComptesBancaire;

public class ComptePayant extends Comptes {

    public ComptePayant(float solde) {
        super(solde);
    }

    public void debit (float debit){
        super.setDebitSolde(debit*1.05F);
    }
    public void virment (float virment){
        super.setVirmentSolde(virment*0.95F);
    }
}
