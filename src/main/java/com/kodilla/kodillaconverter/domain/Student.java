package com.kodilla.kodillaconverter.domain;

public class Student {

    private String firstname;
    private String lastname;
    private String age;

    public Student(){

    }

    public Student(String firstname, String lastname, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String showStudentData(){
        return firstname + ", " + lastname + ", age: " + age;
    }
}
