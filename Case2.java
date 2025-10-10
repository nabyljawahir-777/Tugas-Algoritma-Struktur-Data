public class Case2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            int num = i;
            for (int j = 1; j <= 7; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}
