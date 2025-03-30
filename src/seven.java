import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        genz(input.toCharArray(), 0);
        scanner.close();
    }

    public static void genz(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }
        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            genz(chars, currentIndex + 1);
            swap(chars, currentIndex, i); // backtrack
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}