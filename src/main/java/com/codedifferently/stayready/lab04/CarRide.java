package com.codedifferently.stayready.lab04;

import java.time.Year;
import java.util.Scanner;

public class CarRide {

    public String areWeThereYetTest() {

        Scanner response = new Scanner(System.in);

        System.out.println("Are we at the end destination yet?");
        String dad_Response = response.next().toLowerCase();
        //.equalsIgnoreCase()

        while (!dads_Answer(dad_Response))
        {
            System.out.println("Are we at the end destination yet?");
            dad_Response = response.next().toLowerCase();

        }

        //if you say no first, the while loop is entirely skipped beause the condition automatically false
        return "Good!";

    }
    //boolean method needed for user i/o

    public boolean dads_Answer(String dad_Response) {

        boolean final_answer = false;
        if (dad_Response.equals("yes"))
        {
            final_answer = true;
        }

        return final_answer;
    }


    public static void main(String[] args) {
        CarRide car = new CarRide();
        System.out.println(car.areWeThereYetTest());

    }
    }




