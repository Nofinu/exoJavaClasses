package org.example.ComptesBancaire;

public class Comptes {
    private String code;
    private float solde;

    private static int cpt =10;

    public Comptes() {
    }

    public Comptes(float solde) {
        this.code = String.valueOf(cpt++) + String.valueOf(cpt++);
        this.solde = solde;
    }

    protected void setDebitSolde(float debit) {
        this.solde -= debit;
    }

    protected void setVirmentSolde(float virment) {
        this.solde += virment;
    }

    public float getSolde() {
        return solde;
    }
    @Override
    public String toString() {
        return "Comptes{" +
                ", solde=" + solde +
                '}';
    }
}
