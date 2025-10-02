import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int largest = a;
        String varName = "a";

        if (b > largest) {
            largest = b;
            varName = "b";
        }
        if (c > largest) {
            largest = c;
            varName = "c";
        }

        System.out.println("The largest number is " + varName + " = " + largest);

        sc.close();
    }
}
