import java.util.Scanner;

class selection{
        private int list[];
        private int size;
        private int temp;
    
        public void inpElement(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the list: ");
            size = sc.nextInt();
           
            list = new int[size];
            
            for (int i = 0; i < list.length; i++) {
                System.out.print("Enter the list value " + (i+1) + " : ");
                list[i]= sc.nextInt();
            }
            
           
        }

        public void sort(){
          
                // compare min Index one by one with other elements 
                for (int i = 0; i < list.length-1; i++)
                {
                    int min_idx = i;
                    for (int j = i+1; j < list.length; j++)
                        if (list[j] < list[min_idx])
                            min_idx = j;
                    // swapping with min index
                    int temp = list[min_idx];
                    list[min_idx] = list[i];
                    list[i] = temp;
                }
            

        }

        public void printArray(){
            for(int i = 0; i < list.length; i++){
                System.out.print(list[i]+ " ");
            }
        }
}

public class SelectionSort {
    public static void main(String[] args) {
        selection SS = new selection();
        SS.inpElement();
        System.out.print("The unsorted list is: ");
        SS.printArray();
        SS.sort();
        System.out.print("\nThe sorted list is: ");
        SS.printArray();
        
    }
   
}
