package com.codedifferently.stayready.lab04;


import java.awt.*;

public class Shapes {


    public static void main(String[] args) {
        Shapes test = new Shapes();
        System.out.println(test.tableSquares(4));
        System.out.println(test.triangle());

    }

    public String triangle(){

        String tri ="";
        //amount of line
        for(int i = 0; i <=5; i++) {
            //stars in each line
            for (int j = 0; j < i; j++) {
                //exmpty space at top bc outer for loop starts at 0, therefore bank space
                tri+="*";
            }
            tri+="\n";
        }

        return tri;
    }

    public String tableSquare(){

        String table = "";

        //outer for loops determines what row (vertically) wer're completing; row is 1 we're doing all multiples of 1

        for (int number_row = 1; number_row <= 4; number_row++) {

            //inner loop is doing the multiplication products (determined by row and column iteration)
            for (int number_column = 1; number_column <= 4; number_column++)
            {
                int product = number_column * number_row;
                //string format added consistent spacing to maintain square shape
                String partial_row = String.format("| %5d |", product);

                table = table + "  " + partial_row;

            }
            //once string row is completed, it added cummulatively & line is broken for next loop iteration
            table = table + "\n";
        }
        return table;
    }

    public String tableSquares(int tableSize){

        String table = "";

        //outer for loops determines what row (vertically) wer're completing; row is 1 we're doing all multiples of 1

        for (int number_row = 1; number_row <= tableSize; number_row++) {

            //inner loop is doing the multiplication products (determined by row and column iteration)
            for (int number_column = 1; number_column <= tableSize; number_column++)
            {
                int product = number_column * number_row;
                //string format added consistent spacing to maintain square shape
                String partial_row = String.format("| %5d |", product);

                table = table + "  " + partial_row;

            }
            //once string row is completed, it added cummulatively & line is broken for next loop iteration
            table = table + "\n";
        }
        return table;
    }
}
