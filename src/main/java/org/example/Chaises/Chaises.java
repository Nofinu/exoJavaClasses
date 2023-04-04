package org.example.Chaises;

public class Chaises {
    int nbPieds;
    String couleur;
    String materiaux;

    public Chaises(int nbPieds, String couleur, String materiaux) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.materiaux = materiaux;
    }

    public Chaises() {
    }

    public int getNbPieds() {
        return nbPieds;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMateriaux() {
        return materiaux;
    }

    @Override
    public String toString() {
        return "Chaises{" +
                "nbPieds=" + nbPieds +
                ", couleur='" + couleur + '\'' +
                ", materiaux='" + materiaux + '\'' +
                '}';
    }
}
