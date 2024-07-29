package com.company;
import  java.util.Scanner;

public class CWHpractice_set_04 {
    public static void main(String[] args) {
        // Question 1 what will output of this program
//        int a = 10 ;
//        if (a = 11){
//            System.out.println("i am 11");
//        }
//        else{
//            System.out.println("i am not 11");
//        }


        //Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least
        //33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
//        int m1,m2,m3;
//        Scanner M=new Scanner(System.in);
//        System.out.print("Enter your marks of subject 1:");
//        m1= M.nextInt();
//        System.out.print("Enter your marks of subject 2:");
//        m2= M.nextInt();
//    System.out.print("Enter your marks of subject 3:");
//        m3= M.nextInt();
//
//        float average = (m1+m2+m3)/3f;
//        System.out.println("your total percentage is " + average);
//        if(average>40 && m1>=33&&m2>=33&&m3>=33){
//            System.out.println("you're pass.");
//        }
//        else{
//            System.out.println("you are fail,try better next time.");
//        }

        //Question 3 Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //Income Slab   	Tax
        //2.5L – 5.0L  	     5%
        //5.0L – 10.0L   	20%
        //Above 10.0L	    30%


//        Scanner M=new Scanner(System.in);
//        System.out.print("Enter you annual income:");
//        int income = M.nextInt();
//        if (income>=250000&&income<=500000){
//            System.out.print("the amount of tax you have to pay ");
//            float tax = income*0.05f;
//            System.out.println(tax);
//        }
//        else if (income>=500001&&income<=1000000) {
//            System.out.print("the amount of tax you have to pay: ");
//            float tax = income*0.1f;
//            System.out.println(tax);
//
//        }
//       else if  (income>=1000001){
//            System.out.println("the amount of tax you have to pay: ");
//            float tax = income*0.2f;
//            System.out.println(tax);
//        }
//       else {
//            System.out.println("You does not have to pay any type of tax");
//        }

        // Question 4 Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!
//        Scanner M=new Scanner(System.in);
//        int day = M.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4 :
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                    System.out.println("have a nice day");

        // Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.
//        Scanner M = new Scanner(System.in);
//        System.out.print("Enter a year:");
//        int year = M.nextInt();
//        int a = year%4;
//
//        if (a==0){
//            System.out.println("The given year is leap year.");
//        }
//        else {
//            System.out.println("The given year is not a leap year.");
//        }

        // Question 6 write a program to find out the type of website from the URL
        //.com – commercial website
        //.org – organization website
        //.in – Indian website

        Scanner M = new Scanner(System.in);
        System.out.print("Enter your website here:");
        String website = M.next();
        if (website.endsWith(".org")){
            System.out.println("its is a origanisational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("it is a commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("it is a INDIAN website.");
        }

        }
}

