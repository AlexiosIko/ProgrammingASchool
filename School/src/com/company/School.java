package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
//School class containing teachers, students, and courses
class School {
    ArrayList<String> teachers = new ArrayList<>();
    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> courses = new ArrayList<>();

    //teachers
    public void addTeachers(String name) {
        teachers.add(name);
    }
    //removes the most recent teacher
    public void removeTeachers() {
        teachers.remove(teachers.size() - 1);
    }
    public ArrayList<String> getTeachers() {
        return teachers;
    }
    //prints list of teachers
    public void printListTeachers() {
        System.out.println(teachers);
    }

    //students
    public void addStudents(String name) {
        students.add(name);
    }
    //removes the most recent student
    public void removeStudents() {
        students.remove(students.size() - 1);
    }
    //prints lists of students
    public ArrayList<String> getStudents() {
        return students;
    }
    public void printListStudents() {
        System.out.println(students);
    }

    //classes
    public void addCourses(String name) {
        courses.add(name);
    }
    //removes most recent course
    public void removeCourses(String name) {
        courses.remove(students.size() - 1);
    }
    public ArrayList<String> getCourses() {
        return courses;
    }
    //prints list of courses
    public void printListCourses() {
        System.out.println(courses);
    }
}
