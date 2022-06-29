
class parent{

    protected void score(){
        System.out.println("Parent class");
    }

}

public class Inheritance extends parent {
    
    public static void main(String[] args) {
        Inheritance in = new Inheritance();
        int array[] = {1,2,3,4};
        // int array1= new int[5];

        for(int j:array){
            System.out.println(j);
        }


        in.score();
    }
}

