import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExercise {
    String item;
    int no;
    int price;
    int quantity;
    int subtotal;

    public ArrayExercise(int no, String item, int price, int quantity) {
        this.no = no;
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = price * quantity;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayExercise> Task = new ArrayList<>(); // di kawitan didieu
        String answer;

        int no = 1;

        do {
            System.out.println("Enter the item name");
            String item = input.nextLine();

            System.out.println("Enter the item prices");
            int price = input.nextInt();

            System.out.println("Enter the item quantity");
            int quantity = input.nextInt();
            input.nextLine();

            Task.add(new ArrayExercise(no, item, price, quantity));
            no++;

            System.out.println("Enter the item again? (yes/no)");
            answer = input.nextLine();

        } while (answer.equalsIgnoreCase("yes"));

        System.err.println("-----------------------------------------------");
        System.out.printf("%-4s %-10s %-10s %-10s %-10s\n","No", "Item", "Price", "Quantity", "Subtotal");
        System.out.println("-----------------------------------------------");

        int total = 0;
        for (ArrayExercise i : Task) {
           System.out.printf("%-4d %-10s %-10d %-10d %-10d\n", i.no, i.item, i.price, i.quantity, i.subtotal);
           total += i.subtotal;
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Total: %d\n", total);
        input.close();
    }
}
