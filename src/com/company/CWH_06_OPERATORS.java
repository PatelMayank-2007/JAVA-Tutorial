package com.company;

public class CWH_06_OPERATORS {
    public static void main(String[] args) {
        // arithmetic operators
//        int a = 4;
//        int b = 6 + a;
//        System.out.println(b);
          int a=4;
          int b = 6%a;   //  % is equals to modulo operators
        System.out.println(b);

        // Assignment operators
        int c = 9;
        c *=3;
        System.out.println(c);

        // comparison operators
//        System.out.println(64<6);

        // logical operators
        System.out.println(64>5 && 64<12);
        System.out.println(64>23 || 64>100);


    }
}
