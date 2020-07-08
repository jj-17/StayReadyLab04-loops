package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

import java.util.Scanner;

public class CarRideTest {
    @Test
    public void CarRideTest1(){
        //Scanner sc = new Scanner(System.in);
        CarRide carRide = new CarRide();
        // String response = sc.next();

        boolean expected = true;

        boolean actual = carRide.evalString("yes");

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void CarRideTest2(){
        CarRide carRide = new CarRide();
        Assert.assertFalse(carRide.evalString("sure"));
    }

}

