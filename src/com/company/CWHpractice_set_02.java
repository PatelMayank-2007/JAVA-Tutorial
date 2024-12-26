package com.company;
import java.util.Scanner;

public class CWHpractice_set_02 {
    public static void main(String[] args) {
        // Question 1 : What will be result of the following expression float a = 7/4 * 9/2
//            float a =( 7/4.0f) * (9/2.0f);
//        System.out.println(a);

        //Question 2:   Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.\
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

//        // decrypting a grade
        grade= (char)(grade - 8);
        System.out.println(grade);

        //Question 3:Use comparison operators to find out whether a given number is greater than the user entered number or not.
//        Scanner M = new Scanner(System.in);
//        System.out.print("enter your number:");
//        int a = M.nextInt();
//        System.out.println(a>8);

        // Question 4: Write the following expression in a java program (v^2-u^2)/2as
//        System.out.println("(v*v-u*u)/2*a*s ");

        //Question 5: Find the value of 'a' in expression given below :
        //int x = 7
        //int a = 7*49/7 + 35/7
        int a = 7*49/7 + 35/7;
        System.out.println(a);






    }
}
