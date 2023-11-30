import java.util.Scanner;
public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan angka : ");
        n = sc.nextInt();
        if (cekPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    public static boolean cekPrima(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return cekPrima(n, i + 1);
    }
}
