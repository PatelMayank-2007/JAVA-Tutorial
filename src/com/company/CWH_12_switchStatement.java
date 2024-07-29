package com.company;

import java.util.Scanner;

public class CWH_12_switchStatement {
    public static void main(String[] args) {
         Scanner M = new Scanner(System.in);
         System.out.println("enter your age:");
         int age =M.nextInt();
         switch (age){
             case 18:
                 System.out.println("Now you are eligible to vote and you are now adult");
                 break;
             case 23:
                 System.out.println("Now you are going to join job");
                 break;
             case 45:
                 System.out.println("Now you have to settle down in life");
                 break;
             case 60:
                 System.out.println("its time to retired now.");
                 break;
             default:
                 System.out.println("Enjoy your life,Always be happy. ");
         }

//        Scanner M = new Scanner(System.in);
//        System.out.println("enter your age:");
//        int age =M.nextInt();
//        if (age>56){
//            System.out.println("You are experienced");
//        }
//        else if(age>46){
//            System.out.println("you are semi-experienced");
//        }
//        else if (age> 36){
//            System.out.println("you are semi semi experienced person");
//        }
//        else {
//            System.out.println("You are not experienced person");
//        }
    }
}

