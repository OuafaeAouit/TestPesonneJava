package com.test1.Personne;

public class Personne {
    private String First_name;
    private String Last_name;
    private Integer age;

    public Personne() {

    }

    public Personne(String first_name, String last_name, Integer age) {
        First_name = first_name;
        Last_name = last_name;
        this.age = age;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "First_name='" + First_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                ", age=" + age +
                '}';
    }
}
