package com.dz11;

public class Woman extends Person {
    protected int retirementAge = 65;

    protected Man husband;

    private final String maidenName;

    public Woman(String firstName, String lastName, int age, float height, float weight) {
        super(firstName, lastName, age, height, weight);
        this.maidenName = lastName;
    }

    public Woman(String firstName, String lastName, int age, float height, float weight, Man husband) {
        this(firstName, lastName, age, height, weight);
        this.setHusband(husband);
    }

    public void setHusband(Man husband) {
        this.husband = husband;
        this.registerPartnership(husband.getLastName());
    }

    public Man getHusband() {
        return this.husband;
    }

    public void registerPartnership(String partnerLastName) {
        this.lastName = partnerLastName;
    }

    public void deregisterPartnership(boolean doRevert) {
        if (doRevert) {
            this.lastName = this.maidenName;
        }
    }

    @Override
    public String toString() {
        return "Woman{" +
                "husband=" + (husband != null ? husband.getFirstName() + " " + husband.getLastName() : "null") +
                ", maidenName='" + maidenName + '\'' +
                ", " + super.toString() +
                '}';
    }
}
