import java.util.Scanner;

class Quick 
{
    private int list[];
    public int size;

    public void inpElement() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        size = sc.nextInt();

        list = new int[size];

        for (int i = 0; i < list.length; i++) 
        {
            System.out.print("Enter the list value " + (i + 1) + " : ");
            list[i] = sc.nextInt();
        }

    }

    public void quick(int start, int end) 
    {
        if (start < end) 
        {
            int p = partition(list, start, end);
            quick(start, p-1);
            quick(p + 1, end);
        }
    }

    public int partition(int list[], int start, int end) 
    {
        int i = start-1;
        int temp;
        int pivot = list[end];

        for (int j = start; j < list.length; j++) 
        {
            if(list[j]<pivot)
            { 
                i++;
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }
        temp = list[i+1];  
        list[i+1] = list[end];  
        list[end] = temp;  
        return (i + 1);  
    }

    public void printArray() 
    {
        for (int i = 0; i < list.length; i++) 
        {
            System.out.print(list[i] + " ");
        }
    }

}

public class QuickSort
{
	public static void main(String[] args) 
	{
		Quick QS = new Quick();
        QS.inpElement();
        System.out.print("The sorted list is: ");
        QS.printArray();
        QS.quick(0,QS.size-1);
        System.out.print("\nThe sorted list is: ");
        QS.printArray();
	}
}
