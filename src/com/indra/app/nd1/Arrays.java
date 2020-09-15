package com.indra.app.nd1;


import java.util.Random;
import java.util.Scanner;


public class Arrays {
    public static void main(String[] args){
        //ARRAYS ---> ND -->
        //1 part..Create an array and print all its members in 3 cycles.
        String[] namesArr = {"Tomas", "Tadas", "Martyna", "Paulius", "Viktorija", "Laura", "Guoda"};
        // cycle for:
        System.out.println("cycle for");
        for (int i = 0; i < namesArr.length; i++) {
            System.out.println((i + 1) + "name for: " + namesArr[i]);
        }
        // Cycle enhanced for:
        System.out.println("cycle enhanced for");
        for (String i : namesArr) {
            System.out.println("name enhanced for: " + i);
        }
        // Cycle while:
        System.out.println("cycle while");
        int i = 0;
        while (i < namesArr.length) {
            System.out.println((i+1) + "name while: " + namesArr[i]);
            i++;
        }
        // 2 part -->
        Scanner scArr = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int [] intArr = new int[scArr.nextInt()];
        Random arr;
        arr = new Random();
        // Cycle for
        System.out.println("Cycle for");
        for (int j = 0; j < intArr.length; j++) {
            intArr[j] = arr.nextInt();
            System.out.println(intArr[j]);
        }
        // Cycle enhanced for
        System.out.println("Cycle enhanced for");
        for (int j : intArr) {
            System.out.println(j);
        }
        // Cycle while
        System.out.println("Cycle while");
        int j = 0;
        while (j < intArr.length) {
            System.out.println(intArr[j]);
            j++;
        }



    


}




}
