import java.util.Scanner;

 class BubbleSort{

    private int list[];
    private int size, Value;
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
        while(size>0){
            for(int i=0; i<size-1; i++){
                if(list[i]>list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                } else{
                    i++;
                }
            }
            size--;
        }
        
    }

    public void printArray(){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+ " ");
        }
    }

    
}
public class Bubble {
    public static void main(String[] args) {
        BubbleSort BS = new BubbleSort();
        BS.inpElement();
        System.out.print("The unsorted list is: ");
        BS.printArray();
        System.out.print("\nThe sorted list is: ");
        BS.sort();
        BS.printArray();
     }
}
