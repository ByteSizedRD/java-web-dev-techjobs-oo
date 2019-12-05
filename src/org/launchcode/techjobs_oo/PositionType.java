package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

//added toString method to return data stored in value (Used "Generate" to create code)

    @Override
    public String toString() {
        return "PositionType{" +
                "value='" + value + '\'' +
                '}';
    }



    //equals() and hashCode() created when id fields match
    //https://www.javaworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html

    @Override
    public boolean equals(Object o) {+
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // Getters and Setters:

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
