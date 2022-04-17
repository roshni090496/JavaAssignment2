package com.company;

public class ReverseIntegerNos {

        public static void main(String[] args)
        {
            // Reverse the integer no using for loop statement
            int number = 231, reverse = 0;

            for( ;number != 0; number=number/10)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }

