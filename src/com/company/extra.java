package com.company;
import java.util.Scanner;

public class extra {
//    public class Solution {

//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("================================");
//            for(int i=0;i<3;i++){
//                String s1=sc.next();
//                int x=sc.nextInt();
//                System.out.printf("%-15s%03d\n",s1,x);
////                System.out.println("\n");
//            }
//            System.out.println("================================");
//
//        }
//    }
//class Solution{
//    public static void main(String[] args){
//
//        if(a||e||i||o||u){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//
//        }
//
//    }
//}

//    class Solution{
        public static void main(String[] args){
            Scanner M = new Scanner(System.in);
            System.out.println("c = ");
            String c =M.next();
                    // Ensure the input is a single character
                    if (c.length() != 1) {
                        System.out.println("Please enter a single character.");
                    } else {
                        char ch = c.charAt(0);
                        switch (ch) {
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                System.out.println("YES");
                                break;
                            default:
                                System.out.println("NO");
                        }
                    }
                }
            }











