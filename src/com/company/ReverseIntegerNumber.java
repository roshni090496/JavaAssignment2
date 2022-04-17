package com.company;

public class ReverseIntegerNumber {

        public static void main(String[] args) {
            //Reverse the Integer no using While Loop Statement
            int i = 123, rev = 0;
            System.out.println("Number: " + i);
            while(i != 0) {
                int digit = i % 10;
                rev = rev * 10 + digit;
                i /= 10;
            }
            System.out.println("Reverse of the number: " + rev);
        }
    }


