import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int result = power(a, n);
        System.out.println(result);
        scanner.close();
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / power(a, -n);
        } else {
            return a * power(a, n - 1);
        }
    }
}