import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N (1<=N<=9):");
        int N = scanner.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int j = N; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}