package com.rest.java.app.app.model;

public class Customer {

    private String gender;
    private int age;
    private String email;
    private int satisfaction;

    public Customer(String gender, int age, String email, int satisfaction) {
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.satisfaction = satisfaction;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    @Override
    public String toString() {
        return "Customer [age=" + age + ", email=" + email + ", gender=" + gender + ", satisfaction=" + satisfaction
                + "]";
    }

}
