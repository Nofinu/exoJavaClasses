package org.example.Salarie;

public class Commercial extends Salarie{
    private double ChiffreDaffaire;
    private int commission;

    private int distance=0;

    public Commercial() {
    }

    public Commercial(String nom, double salaire, double chiffreDaffaire, int commission) {
        super(nom, salaire);
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

    @Override
    public void calculSalaire() {
        this.Salaire += commission;
    }

    public void seDeplacer(){
        distance += 1000;
    }
}
