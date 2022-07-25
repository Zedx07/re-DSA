package Array;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int array[]=new int[size];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
