import java.util.Scanner;

public class ExamAnaylsis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of the student: ");
        int score = sc.nextInt();

        if (score != 0) {
            if (score < 80) {
                System.out.println("Fail! Try harder next time");
            } else {
                System.out.println("Congrats! you have passed the exam");
            }
        } else {
            System.out.println("Zero isn't allowed.");
        }
    }

}