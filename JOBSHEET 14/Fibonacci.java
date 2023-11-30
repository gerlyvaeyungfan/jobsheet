import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulan;
        System.out.print("Masukkan jumlah bulan : ");
        bulan = sc.nextInt();
        int jumlahPasangan = hitungPasanganMarmut(bulan);
        System.out.println("Pada akhir bulan ke-" + bulan + " terdapat " + jumlahPasangan + " pasangan marmut.");
    }

    public static int hitungPasanganMarmut(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(n - 1) + hitungPasanganMarmut(n - 2);
        }
    }
}
