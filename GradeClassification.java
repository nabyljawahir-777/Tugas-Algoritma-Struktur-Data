import java.util.Scanner;

public class GradeClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade: ");
        int grade = sc.nextInt();

        if (grade >= 80 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("B");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("C");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println("D");
        } else if (grade >= 0 && grade <= 49) {
            System.out.println("F");
        } else {
            System.out.println("invalid");
        }

        sc.close();
    }
}
