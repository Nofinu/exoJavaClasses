package org.example.Chaises;

public class MainChaises {

    public static void main() {
        Chaises chaise1 = new Chaises(4,"bleu","bois");
        affichage(chaise1);

        Chaises chaise2 = new Chaises(1,"blanche","metal");
        affichage(chaise2);

        Chaises chaise3 = new Chaises(3,"transparent","pléxiglass");
        affichage(chaise3);

    }

    public static void affichage(Chaises objet) {

        System.out.println("--------------- Affichage d'un nouvelle objet ---------------");
        System.out.println("je suis une Chaise, avec "+objet.getMateriaux()+" pieds en "+objet.getMateriaux()+" est de couleur "+objet.getCouleur());
    }
}
