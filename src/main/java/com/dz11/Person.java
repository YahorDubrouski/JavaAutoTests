package com.dz11;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected float height;
    protected float weight;
    protected int retirementAge = 60;

    public Person(String firstName, String lastName, int age, float height, float weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isRetired() {
        return this.age > this.retirementAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", retirementAge=" + this.retirementAge +
                ", isRetired=" + (this.isRetired() ? "Yes" : "No") +
                '}';
    }
}
