import java.util.Scanner;

public class Main {
    public static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(min(a));
    }

}
