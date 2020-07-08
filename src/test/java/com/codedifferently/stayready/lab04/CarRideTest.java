package com.codedifferently.stayready.lab04;


import org.junit.*;

import java.awt.*;

public class CarRideTest {

    @Test
    public void testGetSmallMultiplicationTable() {
        Shapes test = new Shapes();
        String expected =
                "  1 |  2 |  3 |  4 |  5 |\n" +
                        "  2 |  4 |  6 |  8 | 10 |\n" +
                        "  3 |  6 |  9 | 12 | 15 |\n" +
                        "  4 |  8 | 12 | 16 | 20 |\n" +
                        "  5 | 10 | 15 | 20 | 25 |\n";

        String actual = test.tableSquares(5);
        Assert.assertEquals(expected, actual);
    }

}
