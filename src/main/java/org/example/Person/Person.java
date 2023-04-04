package org.example.Person;

public class Person {
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public void hello (){
        System.out.println("Hello !");
    }

    public void showAge (){
        System.out.println("My age is : "+age+" years old");
    }
}
