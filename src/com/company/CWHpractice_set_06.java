package com.company;

public class CWHpractice_set_06 {
    public static void main(String[] args) {
        // Question 1 create a float array and made there sum.
//        float[]marks = {45.7f,34.5f,87.8f,56.7f,45.6f};
//        float sum = 0 ;
//        for (int i = 0;i<5;i++){
//
//            sum = sum + marks[i];
//        }
//        System.out.println("The value of sum is " + sum);

        // Question 2 Write a program to find out whether a given integer is present in an array or not.

//        float[]marks = {45.7f,34.5f,87.8f,56.7f,45.6f};
//        float num = 45.7f;
//        boolean isInArray = false;
//        for (float element:marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//            if (isInArray){
//                System.out.println("the value is present in array.");
//                }
//            else{
//                System.out.println("the value is absent in array.");
//            }

        // Question 3 Calculate the average marks from an array containing marks of all students in physics using a for-each loop.


//        float[]marks = {45.7f,34.5f,87.8f,56.7f,45.6f};
//        float sum = 0;
//        for(float element : marks){
//            sum = sum + element;
//        }
//        System.out.println("The average of marks is " + sum/marks.length);

        // Question 4 Create a Java program to add two matrices of size 2x3.

//        int[][] mat1= {{1,2,3},
//                       {4,5,6}};
//        int[][] mat2= {{11,22,43},
//                       {47,53,63}};
//        int[][] result = {{0,0,0},
//                          {0,0,0}};
//        for(int i =0 ; i<mat1.length;i++){
//            for(int j = 0 ; j<mat1[i].length;j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }

//        Question 5 write a program to reverse an array.


//        int [] arr ={2,3,4,5,6,7};
//        int l = arr.length;
//        System.out.println(l);
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for(int i = 0 ; i<n; i++) {
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
        // question 6 getting a max form an array.
//        int arr[] = {32,654,765,76,45,76,87,56,34,1,54,786};
//        int max = 0;
//        for ( int e: arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println("the maximum value is:" +max+ ".");

        // question 7 getting a min from an array.
//         int arr[] = {32,654,765,76,45,76,87,56,34,1,54,786};
//        int min =999999999;
//        for (int e : arr){
//            if (e<min){
//                min = e;
//            }
//        }
//        System.out.println("the minimum value is:" +min+ ".");  

        // question 8 telling if the array is sorted or not
        boolean issorted = true;
        int arr[]= {1,2,3,4,5,6,79,8};
        for(int i = 0 ; i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                issorted= false;
                break;
            }
        }
        if(issorted){
            System.out.println("array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }




    }
}

