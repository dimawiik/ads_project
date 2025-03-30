import java.util.Scanner;

public class fives {
    public static int fives(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        return fives(n-2) + fives(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fives(n));
    }
}
