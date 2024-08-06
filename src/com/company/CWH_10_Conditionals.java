package com.company;
import java.util.Scanner;
public class CWH_10_Conditionals {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Enter your age here:");
        int age = M.nextInt();  
        if (age >= 18) {
             System.out.println("you are in adult category ");
        }
        else
        {
            System.out.println("you are in child category");
        }
    }
}
