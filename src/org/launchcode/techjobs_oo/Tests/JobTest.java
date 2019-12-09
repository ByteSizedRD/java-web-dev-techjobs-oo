package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.time.Clock;

import static junit.framework.TestCase.*;


public class JobTest {

    //creating fields for testing
    Job new_job1;
    Job new_job2;
    Job new_job3;
    Job new_job4;
    Job new_job5;

    //using @Before to set Job objects for testing
    @Before
    public void testJobObjects() {
        new_job1 = new Job();
        new_job2 = new Job();
        new_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        new_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    //each Job object id should be not the same, differ by +/- 1
    @Test
    public void testSettingJobId() {
        assertTrue(!new_job1.equals(new_job2));
        assertTrue(new_job1.getId() + 1 == new_job2.getId());
    }

    // each Job object should contain 6 fields & proper data types
    //int id, String name, Employer employer, Location location, PostiionType postiontype, CoreCompetency corecompetency

    @Test
    public void testJobConstructorSetAllFields() {
        assertTrue(new_job3 instanceof Job);
        assertEquals(3, new_job3.getId(), .001);
        assertTrue((new_job3.getName() == "Product tester"));
        assertTrue((new_job3.getEmployer().getValue() == "ACME"));
        assertTrue((new_job3.getLocation().getValue() =="Desert"));
        assertTrue((new_job3.getPositionType().getValue() == "Quality control"));
        assertTrue((new_job3.getCoreCompetency().getValue() == "Persistence"));
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(new_job3.equals(new_job4));
    }

    //should return string that contains a blank line before  & after job information
    @Test
    public void testForBlankLines() {
        assertTrue(new_job3.toString().startsWith("\n"));
        assertTrue(new_job3.toString().endsWith("\n"));
    }

    //string should contain field label, field data, each field on own line.

    @Test
    public void testForFieldLabelDataStructure() {
        assertEquals(
                "\nID: 3" + "\nName: " + "Product tester" +
                "\nEmployer: " + "ACME" +
                "\nLocation: " + "Desert" +
                "\nPosition Type: " + "Quality control" +
                "\nCore Competency: " + "Persistence" + "\n", Job.toString(new_job3));
    }
}
//**From Job: using to write accurate tests
//    int id = "\nID: " + job.getId();
//    String name = "\nName: " + job.getName();
//    String employer = "\nEmployer: " + job.getEmployer();
//    String location = "\nLocation: " + job.getLocation();
//    String positionType = "\nPosition Type: " + job.getPositionType();
//    String coreCompetency = "\nCore Competency: " + job.getCoreCompetency();
//    new_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));