package com.company;

class Teachers {
    String firstName;
    String lastName;
    String subject;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    //prints teachers firtname, last name, and their subject
    public void printTeacher() {
        System.out.println("Name: " + firstName + " " + lastName + " Subject: " + subject);
    }
}
