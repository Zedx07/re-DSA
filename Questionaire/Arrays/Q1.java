package Questionaire.Arrays;

import java.util.Scanner;

public class Q1 {
    static int temp;

    static void revArray(int array[], int start, int end) {

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int array[]){
        
        for(int i=0; i<array.length; i++ ){
            System.out.println(array[i]+" ");
        }
        // return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array[] = new int[] { 1, 2, 3, 4 };
        // int array[] = new int[4];
        // array[i] --> enter the input
        System.out.println("Enter the elements in th array:");
        // for (int i = 0; i <= array.length; i++) {
        //     array[i] = sc.nextInt();
        // }
        
        revArray(array,0,3);
        printArray(array);


        // for (int i = array.length - 1; i >= 0; i--) {
        //     System.out.println(array[i]);
        // }
    }
}
