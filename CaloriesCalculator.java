import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Running
        System.out.print("Enter running time in minutes: ");
        int runMinutes = sc.nextInt();
        int runCalories = (runMinutes / 5) * 60;

        // Push-ups
        System.out.print("Enter push-up time in minutes: ");
        int pushMinutes = sc.nextInt();
        int pushCalories = (pushMinutes / 30) * 200;

        // Plank
        System.out.print("Enter plank time in minutes: ");
        int plankMinutes = sc.nextInt();
        int plankCalories = plankMinutes * 5;

        int totalCalories = runCalories + pushCalories + plankCalories;

        System.out.println("Calories burned:");
        System.out.println("Running: " + runCalories);
        System.out.println("Push-ups: " + pushCalories);
        System.out.println("Planks: " + plankCalories);
        System.out.println("Total: " + totalCalories);

        sc.close();
    }
}
