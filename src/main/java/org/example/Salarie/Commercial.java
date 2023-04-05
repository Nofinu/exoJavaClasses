package org.example.Salarie;

public class Commercial extends Salarie implements CalculSalaire{
    private double ChiffreDaffaire;
    private int commission;

    private int distance=0;

    public Commercial() {
    }

    public Commercial(String nom, double salaire,int numero ,String rue,int codePostal, double chiffreDaffaire, int commission) {
        super(nom, salaire,numero,rue,codePostal);
        ChiffreDaffaire = chiffreDaffaire;
        this.commission = commission;
    }

    public double getChiffreDaffaire() {
        return ChiffreDaffaire;
    }

    public void setChiffreDaffaire(double chiffreDaffaire) {
        ChiffreDaffaire = chiffreDaffaire;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }


    public void seDeplacer(){
        distance += 1000;
    }

    @Override
    public void calculSalaire() {
        this.Salaire += (commission/100)*ChiffreDaffaire;
    }
}
