import java.util.Scanner;

public class BinarySearch {

    private int list[];
    private int size, Value;
    private boolean found = false;
    private int start=0,end=0,mid=0;

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
        start=0;
        end= size-1;
        
        while(start<=end){
            mid = (start+end)/2;
            if(list[mid]==Value){
               System.out.println("We found the element at index: "+ mid); 
               found = true;
               break;
            } 

            if(Value<list[mid]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
            System.out.println("start="+start+", end="+end+", mid="+mid);

        }
        if(!found){
        System.out.println(" Error! Value is not there in the given list");

        }
    }

    public static void main(String[] args) {
       BinarySearch BS = new BinarySearch();
       BS.inpElement();
       BS.findElement();
    }
}
