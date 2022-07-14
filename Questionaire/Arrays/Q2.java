package Questionaire.Arrays;

import java.util.Scanner;

public class Q2 {

    static void findElement(int array[]){
        int start = array[0];
        int end = array[1];
        if(array[start]>array[end]){
            
        }
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        int array[] = new int[4];
        
        // input with for loop
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            System.out.println();
        }
        
        // // input with foreach loop
        // int k = 0;
        // for (int m : array) {
        //     array[k] = sc.nextInt();
        //     ++k;
        // }

        // output with foreach loop
        int n = 0;
        for (int m : array) {
            System.out.println(array[n]); 
            ++n;
        }

        System.out.println("Enter the index in the array:");
        int find = sc.nextInt();
        System.out.println(array[find]);

        // output with for loop
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }
    }
}
