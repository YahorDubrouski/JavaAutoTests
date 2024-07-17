package com.dz11;

public class Man extends Person {
    protected int retirementAge = 60;

    private Woman wife;

    public Man(String firstName, String lastName, int age, float height, float weight, Woman wife) {
        this(firstName, lastName, age, height, weight);
        this.setWife(wife);
    }

    public Man(String firstName, String lastName, int age, float height, float weight) {
        super(firstName, lastName, age, height, weight);
    }

    public void setWife(Woman wife) {
        this.wife = wife;
        wife.setHusband(this);
    }

    public Woman getWife() {
        return this.wife;
    }

    @Override
    public String toString() {
        return "Man{" +
                "wife=" + (wife != null ? wife.getFirstName() + " " + wife.getLastName() : "null") +
                ", " + super.toString() +
                '}';
    }
}
