import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        printSequence(n);
    }

    public static void printSequence(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
            printSequence(n - 5);
            System.out.print(n + " ");
        }
    }
}
