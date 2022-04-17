package com.company;

import java.util.Scanner;

public class ArithematicOperation {

        public static void main(String[] args){

            Scanner scn = new Scanner(System.in);
            System.out.println("enter a");
            int a= scn.nextInt() ;
            System.out.println("enter b") ;
            int b=scn.nextInt() ;
            System.out.println("enter c") ;
            int c=scn.nextInt() ;

            int ans1= a +b * c;
            int ans2= c + (a/b);
            int ans3 = (a%b) + c;
            int ans4 = (a*b) +c;
            int finalans= Math.max(ans1, Math.max(ans2, Math. max(ans3,ans4))) ;
            System.out.println(finalans);
        }
}

