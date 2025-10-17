import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    String itemName;
    double price;
    int quantity;

    public ShoppingList(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ShoppingList> cart = new ArrayList<>();

        System.out.print("Masukkan jumlah item: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem ke-" + (i + 1));
            System.out.print("Nama barang : ");
            String name = sc.nextLine();
            System.out.print("Harga (Rp)  : ");
            double price = sc.nextDouble();
            System.out.print("Jumlah      : ");
            int qty = sc.nextInt();
            sc.nextLine();

            cart.add(new ShoppingList(name, price, qty));
        }

        System.out.println("\n===============================================");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Item", "Price", "Qty", "Subtotal");
        System.out.println("===============================================");

        double total = 0;
        for (ShoppingList x : cart) {
            System.out.printf("%-10s %-10.2f %-10d %-10.2f%n",
                    x.itemName, x.price, x.quantity, x.getSubtotal());
            total += x.getSubtotal();
        }

        System.out.println("===============================================");
        System.out.printf("%-10s %-10s %-10s %-10.2f%n", "", "", "TOTAL:", total);
        System.out.println("===============================================");

        sc.close();
    }
}
