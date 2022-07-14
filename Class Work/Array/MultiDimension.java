import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row:");
        int row = sc.nextInt();
        System.out.println("Enter the size of column:");
        int col = sc.nextInt();
        System.out.println("Enter the size of height:");
        int height = sc.nextInt();
        System.out.println("Enter the elemnets:");
        int array[][][] = new int[row][col][height];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[i][j][k]+"  "); 
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


/*
 * Step 1: Start
 * Step 2: Declare three varibles as row , col and height
 * Step 3: Declare an array
 * Step 4: Create a for loop for iterating row 
 * Step 5: Create a nested for loop for iterating col
 * Step 6: Create a nested for loop for iterating height 
 * Step 7: Print the array values
 * Step 8: Stop.
 */