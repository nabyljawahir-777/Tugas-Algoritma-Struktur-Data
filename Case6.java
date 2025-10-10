public class Case6 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= 10; i++) {
            int d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
        System.out.println();
    }
}
