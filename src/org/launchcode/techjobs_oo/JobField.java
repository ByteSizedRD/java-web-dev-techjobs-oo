package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    //Find fields in common in all 4 classes
    //Find constructors in common in all 4 classes
    //Find custom methods in common in all classes
    //Find Getters/Setters in common in all  classes

    //Common fields:
    private int id;
    private static int nextId = 1;
    private String value;


    //Common constructors:
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }


    //Common custom methods toString, equals, and hashcode:
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Common Getters/Setters


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
