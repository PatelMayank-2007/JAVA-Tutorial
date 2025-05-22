package com.company;

import java.util.Scanner;

public class CWH_05_TAKINGINPUT {
    public static void main (String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your first number:" );
        //int a =sc.nextInt();
        float a = sc.nextFloat();
        System.out.print("enter your second number");
        //int b =sc.nextInt();
        float b= sc.nextFloat();
        //int sum =a+b;
        float sum=a+b;
        System.out.print("your answer is: ");
        System.out.println(sum);
        System.out.println("hello world");
        
    }
}
