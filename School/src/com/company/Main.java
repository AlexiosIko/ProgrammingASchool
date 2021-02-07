package com.company;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
    School school = new School();
    Teachers teacher1 = new Teachers();
    Teachers teacher2 = new Teachers();
    Teachers teacher3 = new Teachers();


    teacher1.setFirstName("kayla");
    teacher1.setLastName("klarkson");
    teacher1.setSubject("math");

    teacher2.setFirstName("benny");
    teacher2.setLastName("benjamin");
    teacher2.setSubject("science");

    teacher3.setFirstName("ali");
    teacher3.setLastName("alex");
    teacher3.setSubject("english");

    school.addTeachers(teacher1.getFirstName() + teacher2.getLastName());
    school.addTeachers(teacher2.getFirstName() + teacher2.getLastName());
    school.addTeachers(teacher3.getFirstName() + teacher3.getLastName());
    school.addStudents("billy");
    school.addStudents("alia");
    school.addStudents("jade");
    school.addStudents("michael");
    school.addStudents("selma");
    school.addStudents("lisa");
    school.addStudents("dave");
    school.addStudents("poppy");
    school.addStudents("jessica");
    school.addStudents("kyle");

    school.printListStudents();
    teacher1.printTeacher();
    teacher2.printTeacher();
    teacher3.printTeacher();


    school.removeStudents();
    school.removeStudents();

    //remove teacher3
    teacher3.setSubject("");
    teacher3.setFirstName("");
    teacher3.setLastName("");

    school.printListStudents();
    teacher1.printTeacher();
    teacher2.printTeacher();

    }
}
