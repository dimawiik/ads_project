import java.util.Scanner;

public class second {
    public static double avg(int[] a, int b) {
        double avg = 0;
        for (int i = 0; i < b; i++) {
            avg += a[i];
        }
        avg /= b;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(avg(a,b));
    }
}
