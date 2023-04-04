package org.example.Person;

public class MainPerson {

    public static void main() {
        Person person = new Person();
        Student student = new Student(15);
        Teacher teacher =  new Teacher(40,"Maths");

        person.hello();

        System.out.println("Student :");
        student.hello();
        student.GoToCLasses();
        student.showAge();

        System.out.println("Teacher :");
        teacher.hello();
        teacher.Explain();
    }
}
