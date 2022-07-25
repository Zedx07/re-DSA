public class TernaryOperator {
    public static void main(String[] args) {
        int a = -20, b = -30, c = -500;
        long max = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("The max number is: " + max);
        System.out.println("Yeaaa! used ternary operator :)");
    }
}
