package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField  {

    public Location(String value) {
        super(value);
    }

    public Location() {
        super();
    }



//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }
//
//    //added constructor with parameter String value , calls empty constructor (this();) and initializes value
//
//    public Location(String value) {
//        this();
//        this.value = value;
//    }
//
//
//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
