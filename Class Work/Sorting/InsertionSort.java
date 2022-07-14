import java.util.Scanner;

class insertion {
    private int list[];
    private int size;
    private int temp;

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

    public void insertion_sort(){
        int j;
        // selecting first element
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            j=i-1;
            while(j>=0 && temp <=list[j]){
                list[j+1]=list[j]; // comparing in the sorted array
                j--;
            }
            list[j+1]=temp;
        }
    }

    public void printArray(){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+ " ");
            System.out.println();
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        insertion input = new insertion();
        input.inpElement();
        System.out.println("The unsorted list is: ");
        input.printArray();
        input.insertion_sort();
        System.out.println("\nThe sorted list is: ");
        input.printArray();


    }
    

}
