package com.company;

import java.util.Scanner;

public class UnitTensHundred {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number n,n=1,10,100,1000");


        int n=scn.nextInt();
        if(n==1)
             System.out.println("unit digit");
         else if(n==10)
             System.out.println("tens digit");
         else if(n==100)
             System.out.println("hundred digit");
         else if(n==1000)
             System.out.println("thousand");
    }
}
