package com.company;
import java.util.Scanner;
public class PalindromeNumber1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int t = n;
        int rev = 0;
        while(t!=0) {
            int d = t % 10;
            rev = 10 * rev + d;
            t = t / 10;
        }
        if (rev == n)
            System.out.println( "Input n="+n+" then after reverse output is same "+rev+" then it is a palindrome");
        else
            System.out.print("Input n="+n+" then after reverse output is not same it's "+rev+" then it is not a palindrome number");

        }
    }


