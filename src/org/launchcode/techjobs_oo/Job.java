package org.launchcode.techjobs_oo;

import java.util.Objects;

import static java.lang.String.valueOf;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    //added constructors for unique ID and initializing fields

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

//    //toString method for passing testForBlankLine
//    public String toString() {
//        return " ";
//    }

    //toString method for field label, data, and output structure


    public String toString() {
        String aId = "\nID: " + this.getId();
        String aname = "\nName: " + this.getName();
        String aemployer = "\nEmployer: " + this.getEmployer();
        String alocation = "\nLocation: " + this.getLocation();
        String apositionType = "\nPosition Type: " + this.getPositionType();
        String acoreCompetency = "\nCore Competency: " + this.getCoreCompetency();


        if (this.getEmployer().getValue() == null) {
            aname = "\nName: \"Data Not Available\"";
        }
        if(this.getEmployer().getValue() == null) {
            aemployer = "\nEmployer: Data Not Available";
        }
        if(this.getEmployer().getValue() == null) {
            alocation = "\nLocation: \"Data Not Available\"";
        }
        if (this.getEmployer().getValue() == null) {
            apositionType = "\nPosition Type: \"Data Not Available\"";
        }
        if (this.getEmployer().getValue() == null) {
            acoreCompetency = "\nCore Competency: \"Data Not Available\"";
        }

        return (aId + aname + aemployer + alocation + apositionType + acoreCompetency + "\n");
    }

    //added equals() and hashCode() after adding getters/setters, equal set to id fields match

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Added getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
