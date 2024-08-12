package com.company;

public class CWH_18_Arrays_using_forEach_loop {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79, 99, 80};
        System.out.println(marks.length);
        //Displaying array using naive method
        System.out.println("Displaying array using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying array using for method.
        System.out.println("Displaying array using for loop.");
        for(int i =0 ;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //Displaying array using for loop in reverse order.
        System.out.println("Displaying array using for loop in reverse order.");
        for(int i = marks.length - 1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //Displaying array using for-each loop.
        System.out.println("Displaying array using for-each loop.");
        for(int element:marks) {
            System.out.println(element);
        }
    }
}
