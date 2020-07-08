package com.codedifferently.stayready.lab04;


import java.util.Random;

public class Numbers {

    public static void main(String[] args) {
        Numbers test = new Numbers();

        System.out.println(test.random4());
    }

    public String oneToTen(){
        String output ="oneToTen()\n"
                +"*** Output ***";
        for(int x=1; x<=10; x++){
            output += "\n"+x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n"
                +"*** Output ***";
        for(int x =1; x < 20 ; x+=2){
            output += "\n"+x;
        }
        return output;
    }

    public String squares(){
        String num= "";
        for(int i=0; i<=10; i++){
            num += i*i +" ";
        }
        return num;
    }

    public String random4(){
        String num="";
        Random rand = new Random();
        for(int i = 1; i <=4; i++){
            num += rand.nextInt(10-1) +2 ;
        }
        return num;
    }

    public String even(int n){
        String num= "";
        for(int i=0; i<n; i++){
            if (i%2==0){
                num += i+" ";
            }
        }
        return num;
    }

    public String powers(int n){
        String num= "";
        for(int i=0; i<n; i++){
            num += (int) Math.pow(2, i)+" ";
        }
        return num;
    }

}
