package Algorithms;

public class primeNumber {

    void findprimeNum(int num) {
        int i = 2, Qui, rem = 0;
        while (i < num) {
            Qui = num / i;
            rem = num - i * Qui;
            i++;
            if (rem == 0) {
                System.out.println("The number is not a Prime Number");
                break;
            }
        }
        System.out.println("The number is a Prime Number");

    }

    public static void main(String[] args) {
        primeNumber pN = new primeNumber();
        pN.findprimeNum(5);
    }
}
