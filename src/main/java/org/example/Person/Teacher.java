package org.example.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher(int age, String subject) {
        super(age);
        this.subject = subject;
    }

    public void Explain (){
        System.out.println("Explanation of "+subject+" begins");
    }
}
