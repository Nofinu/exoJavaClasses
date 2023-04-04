package org.example.Employe;

public class Technicien extends Employe{
    private int grade ;

    public Technicien(String nom, int age, double salaire, int grade) {
        super(nom, age, salaire);
        this.grade = grade;
    }

    public int Prime (){
        int prime ;

        switch (grade){
            case 1:
                prime = 100;
                break;
            case 2:
                prime = 200;
                break;
            case 3:
                prime = 300;
                break;
            default:
                prime =0;
                break;
        }

       return prime;
    }


    public void calculSalaire() {
        super.calculSalaire(Prime());
    }
}
