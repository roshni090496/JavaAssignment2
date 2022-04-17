package com.company;

public class SumOfNNaturalNumbers {

        public static void main(String[] args)
        {
            int num = 5, i = 1, sum = 0;

            while(i <= num) {
                if (i==num)
                    System.out.print(i);
                else
                System.out.print(i+"+");
                sum = sum + i;
                i++;
            }
            System.out.print(" = " +sum);
        }
    }



