import java.util.Scanner;

public class IterativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        int total = calculateIterativeSum(N);
        System.out.println("Total (secara iteratif): " + total);
    }

    public static int calculateIterativeSum(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }
}
