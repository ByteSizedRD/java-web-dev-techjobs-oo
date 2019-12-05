package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class JobTest {

    //creating fields for testing
    Job new_job1;
    Job new_job2;
    Job new_job3;

    //using @Before to set Job objects for testing
    @Before
    public void testJobObjects() {
        new_job1 = new Job();
        new_job2 = new Job();
    }

    //each Job object should be not the same, differ by 1
    @Test
    public void testSettingJobId() {
        assertTrue(!new_job1.equals(new_job2));
        assertTrue(new_job1.getId() + 1 == new_job2.getId());
    }

    // each Job object should contain 6 fields & proper data types
    //int id, String name, Employer employer, Location location, PostiionType postiontype, CoreCompetency corecompetency

    @Test
    public void testJobConstructorSetAllFields() {
        new_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(new_job3 instanceof Job);
        assertEquals(3, new_job3.getId(), .001);
        assertTrue((new_job3.getName() == "Product tester"));
        assertTrue((new_job3.getEmployer().getValue() == "ACME"));
        assertTrue((new_job3.getLocation().getValue() =="Desert"));
        assertTrue((new_job3.getPositionType().getValue() == "Quality control"));
        assertTrue((new_job3.getCoreCompetency().getValue() == "Persistence"));
    }




}
