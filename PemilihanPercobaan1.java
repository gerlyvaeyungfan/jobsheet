import java.util.Scanner;

public class ProyekKelompok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.print("Masukkan Merk Buku yang dibeli: ");
        merkBuku = input.nextLine();
        System.out.print("Masukkan Jumlah Barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.print("Masukkan Jumlah Halaman buku yang dibeli: ");
        jmlHalBuku = input.nextInt();
        System.out.print("Masukkan Harga Barang yang dibeli: ");
        harga = input.nextInt();
        System.out.print("Masukkan Besaran diskon barang: ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total - dis;
        bayar = total - jmlDis;

        System.out.println("\nNama Merk Buku yang Anda beli : " + merkBuku);
        System.out.println("Jumlah Halaman Buku yang Anda beli : " + jmlHalBuku);
        System.out.println("Diskon yang Anda dapatkan adalah : " + jmlDis);
        System.out.println("Diskon yang harus Anda bayar adalah : Rp." + bayar);
    }
}
