
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {

        int array[][]=new int[2][2];
        array[0][0]=3;
        array[0][1]=3;
        array[1][0]=3;
        array[1][1]=3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size ");
        // int row = sc.nextInt();
        // int column = sc.nextInt();
        // System.out.println("Enter the elements:");
        // int array[][]=new int[row][column];

        // for(int i=0;i<array.length;i++){
        //     for (int j = 0; j < array.length; j++) {
        //         array[i][j]=sc.nextInt();
        //     }
        // }
        
        System.out.println("\nThe output matrix is:");
        for(int i=0;i<array.length;i++){
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
