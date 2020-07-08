package com.codedifferently.stayready.lab04;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Collections;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

        String actual = numbers.oddNumbers();
        //: Then

        Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void squaresTest(){
        Numbers num=new Numbers();
        String expected = "0 1 4 9 16 25 36 49 64 81 100 ";
        String actual = num.squares();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void random4Test(){
        Numbers num=new Numbers();
        String rand=num.random4();

        ArrayList<Boolean> result = new ArrayList<>();

        //indexing the radnom string and casting each index to a number
        for( int i=0;i<rand.length();i++){
            int digit=Integer.valueOf(rand.charAt(i));
            //
            //chekcing if number is in the intended range, if it is add true to arraylist
            if (digit >= 2 && digit <= 9)
            {
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        Assert.assertTrue(result.contains(Boolean.FALSE));

    }

    @Test
    public void evenTest(){
        Numbers num=new Numbers();
        String expected = "0 2 4 6 8 10 12 14 16 18 ";
        String actual = num.even(20);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void powersTest(){
        Numbers num=new Numbers();
        String expected = "1 2 4 8 16 ";
        String actual = num.powers(5);
        Assert.assertEquals(expected, actual);
    }

}
