import java.util.Scanner;
public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;
        System.out.print("Masukkan angka : ");
        f=sc.nextInt();
        int hasil = hitungPenjumlahan(f);
        System.out.println("Penjumlahan dari 1 hingga " + f + " = " + hasil);
    }

    public static int hitungPenjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungPenjumlahan(n - 1);
        }
    }
}

