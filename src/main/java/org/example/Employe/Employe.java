package org.example.Employe;

public class Employe {
    private String nom;
    private int age;
    protected double salaire;

    public Employe() {
    }

    public Employe(String nom, int age, double salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }

    public void Augmentation (int augmentation){
        calculSalaire(augmentation);
    }

    public void Afficher (){
        System.out.println("nom : "+nom+", age : "+age+", salaire : "+salaire);
    }

   public void calculSalaire(double augmentation){
       salaire += augmentation;
   }
}
