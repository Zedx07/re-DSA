package Algorithms;

import java.util.Scanner;

public class LinearSearch {

    private int list[];
    private int size, Value;
    private boolean found = false;

    public void inpElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list:");
        size = sc.nextInt();
       
        list = new int[size];
        
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the list value " + (i+1) + " : ");
            list[i]= sc.nextInt();
        }
        
        System.out.print("Enter the element to be found: ");
        Value = sc.nextInt();
    }

    public void findElement(){
        
        for (int j = 0; j < list.length; j++) {
            if(list[j]==Value){
                System.out.println("The element is found at position : " + (j+1) );
                found=true;
                // break;
            }
        }
        if(!found){
            System.out.println("The element is not present int he list");
        }
        
        
    }

    public static void main(String[] args) {
       LinearSearch LS = new LinearSearch();
       LS.inpElement();
       LS.findElement();
    }
}
