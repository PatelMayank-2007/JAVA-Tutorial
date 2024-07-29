package com.company;
import  java.util.Scanner;

class Subject{
    float max = 100;
}

public class CWHexercise01 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks of Maths:");
        float a = sc.nextFloat();
        System.out.print("Enter your marks of Physics;");
        float b = sc.nextFloat();
        System.out.print("Enter your marks of Chem: ");
        float c = sc.nextFloat();
        System.out.print("Enter your marks of English:");
        float d = sc.nextFloat();
        System.out.print("Enter your marks of Com:");
        float f = sc.nextFloat();
        float sum = a+b+c+d+f;
        System.out.print("Enter your total marks: ");
        float g = sc.nextFloat();
        float grandtotal = sum / g ;
        float grandtotal1 = grandtotal*100;
        System.out.print("Your total percentage is:");
        System.out.println(grandtotal1);




    }
}
