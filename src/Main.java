import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;
        int c = 0;
        while (b <= a) {
            System.out.print(b);
            if (b != a) {
                System.out.print(" + ");
            } else
                System.out.print(" = ");
            c += b;
            b++;
        }
        System.out.println(c);
    }
}