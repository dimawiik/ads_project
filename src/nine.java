import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (k < 0 || k > n) {
            System.out.println("fault");
        } else {
            long result = cform(n, k);
            System.out.println(result);
        }
        scanner.close();
    }

    public static long cform(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return cform(n - 1, k - 1) + cform(n - 1, k);
    }
}