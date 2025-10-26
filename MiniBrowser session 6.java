import java.util.Scanner;
import java.util.Stack;

public class MiniBrowser session 6{
    public static void main(String[] args) throws Exception {
        Scanner inputx = new Scanner(System.in);
        String answer = "1";
        Stack<String> urls = new Stack<>();

        System.out.println("\n1. Enter the URL");
        System.out.println("2. Back to previous URL");
        System.out.println("3. Show the current URL");
        System.out.println("4. Show the history of the URLs visited");
        System.out.println("5. Exit the program");

        do {
            System.out.print("\nEnter your choice (1–5): ");
            answer = inputx.nextLine();

            if (answer.equals("1")) {
                System.out.print("Enter URL: ");
                String url = inputx.nextLine();
                urls.push(url);
            } 
            else if (answer.equals("2")) {
                if (urls.size() > 1) {
                    urls.pop();
                    System.out.println("Current URL: " + urls.peek());
                } else {
                    System.out.println("No way back to previous URL.");
                }
            } 
            else if (answer.equals("3")) {
                if (!urls.isEmpty()) {
                    System.out.println("Current URL: " + urls.peek());
                } else {
                    System.out.println("No URL visited yet.");
                }
            } 
            else if (answer.equals("4")) {
                if (!urls.isEmpty()) {
                    System.out.println("History: " + urls);
                } else {
                    System.out.println("No browsing history yet.");
                }
            }
        } while (!answer.equals("5"));

        System.out.println("\nExiting browser...");
        inputx.close();
    }
}
