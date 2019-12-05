package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static junit.framework.TestCase.assertTrue;


public class JobTest {

    //creating fields for testing
    Job new_job1;
    Job new_job2;

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




}
