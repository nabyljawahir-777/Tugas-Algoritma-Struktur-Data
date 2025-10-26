import java.util.Scanner;
import java.util.Stack;

public class StacknQueueProject1 {
    String item;
    int no;
    int price;
    int qty;
    int subtotal;

    public StacknQueueProject1 (int no, String item, int price, int qty) {
        this.no=no;
        this.item=item;
        this.price=price;
        this.qty=qty;
        this.subtotal=price*qty;
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
             String answer;
            int no = 1;
            Stack<StacknQueueProject1> Task = new Stack <>();

            do{
                System.out.println("\n==========MENU========== \n1. Add Item \n2. Show Current Item \n3. Show All Items \n4. Remove Last Item \n5. Done \n ========================");
                
                System.out.print("Enter your choice: ");
                answer = input.nextLine();
                System.out.println("========================");
                
                switch (
                    answer
                ) {
                    case "1":
                         System.out.print("Enter the item name       : ");
                         String item = input.nextLine();

                         System.out.print("Enter the item prices     : ");
                          int price = input.nextInt();

                        System.out.print("Enter the item quantity    : ");
                        int qty = input.nextInt();

                        input.nextLine();

                        Task.push(new StacknQueueProject1(no, item, price, qty));no++;
                        System.err.println("Item Added to Queue");
                        break;
                
                    case "2":
                         if (!Task.empty()) {
                        StacknQueueProject1 top = Task.peek();
                        System.out.println("Top item: " + top.item + " (Qty: " + top.qty + ")");
                    } else {
                        System.out.println("Queue is empty!");
                    }
                        break;

                    case "3":
                      if (Task.empty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("__________________________________________________________________");
                        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "No", "Item", "Price", "Qty", "Subtotal");
                        System.out.println("__________________________________________________________________");
                        int total = 0;
                        for (StacknQueueProject1 i : Task) {
                            System.out.printf("%-10d %-10s %-10d %-10d %-10d\n", i.no, i.item, i.price, i.qty, i.subtotal);
                            total += i.subtotal;
                        }
                        System.out.println("__________________________________________________________________");
                        System.out.printf("Total: %d\n", total);
                    }
                        break;

                    case "4":
                        if (!Task.empty()) {
                        StacknQueueProject1 removed = Task.pop();
                        System.out.println("Item removed: " + removed.item);
                    } else {
                        System.out.println("Queue is empty!");
                    }
                        break;
                    
                    case "5":
                     System.out.println("Exiting program...");
                    break;

                    default:
                    System.err.println(" Invalid choice! Please enter 1-5.");
                    break;
                }

            } while (!answer.equals("5"));
            input.close();
        } 

        
     
 }


