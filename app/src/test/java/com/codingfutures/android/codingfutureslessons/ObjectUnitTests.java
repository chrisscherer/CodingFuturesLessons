package com.codingfutures.android.codingfutureslessons;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by CScherer on 5/13/2018.
 */

public class ObjectUnitTests {

    @Before
    private void initTestClasses() {}

    @After
    private void disposeTestClasses() {}

    @Test
    public void ClassVehicleExists() throws Exception {
        try {
            Class.forName("com.codingfutures.android.codingfutureslessons.Vehicle");
        }
        catch( Exception ex) {
            Assert.fail("No class Vehicle found!");
        }
    }

    @Test
    public void VehicleHasANumberOfWheels() throws Exception {
        assertThat(testVehicle, hasProperty("numberOfWheels"));
    }

    @Test
    public void VehicleHasANumberOfDoors() throws Exception {
        assertThat(testVehicle, hasProperty("numberOfDoors"));
    }

    @Test
    public void VehicleHasAnAmountOfGas() throws Exception {
        assertThat(testVehicle, hasProperty("amountOfGas"));
    }

    @Test
    public void SedanHas4Doors() throws Exception {
        assertTrue("Sedan has 4 doors", testSedan.numberOfDoors == 4);
    }

    @Test
    public void SedanHas4Wheels() throws Exception {
        assertTrue("Sedan has 4 wheels", testSedan.numberOfWheels == 4);
    }

    @Test
    public void MotorcycleHas0Doors() throws Exception {
        assertTrue("Motorcycle has 0 doors", testMotorcycle.numberOfDoors == 0);
    }

    @Test
    public void MotorcycleHas2Wheels() throws Exception {
        assertTrue("Motorcycle has 2 wheels", testMotorcycle.numberOfWheels == 2);
    }
}
