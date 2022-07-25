package Sorting;

import java.util.Scanner;

class Merge {
    private int list[];
    public int size;

    public void inpElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        size = sc.nextInt();

        list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the list value " + (i + 1) + " : ");
            list[i] = sc.nextInt();
        }

    }

    public void mergeSort(int start, int end){
       
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, end, mid);
        }
    }

    public void merge(int start,int end, int mid) {
        
        int l_size = mid - start + 1;
        int r_size = end - mid;
        int i,j,k; 
        
        int leftList[] = new int[l_size];
        int rightList[] = new int[r_size];

        for (i = 0; i < l_size; i++)
            leftList[i] = list[start+i];

        for (j = 0; j < r_size; j++)
            rightList[j] = list[mid+1+j];

        i = 0; j = 0; k = start;

        while (i < l_size && j < r_size) {
            if (leftList[i] < rightList[j]) {
                list[k] = leftList[i];
                i++;
            } else {
                list[k] = rightList[j];
                j++;
            }
            k++;
        }

        while (i < l_size) {
            list[k] = leftList[i];
            i++;
            k++;
        }

        while (j < r_size) {
            list[k] = rightList[j];
            j++;
            k++;
        }
    }


    public void printArray() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

}

public class MergeSort {
    public static void main(String[] args) {
        Merge MS = new Merge();
        MS.inpElement();
        System.out.println("The unsorted list is: ");
        MS.printArray();

        MS.mergeSort(0, MS.size-1);
        System.out.println("\nThe sorted list is: ");
        MS.printArray();

    }
    

}
