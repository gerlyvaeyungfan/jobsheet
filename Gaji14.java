import java.util.Scanner;

public class Gaji14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totalGaji;
        int gaji = 400000, ptgnGaji = 25000;
        System.out.print("Masukan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukan Jumlah Hari Tidak Masuk Kerja Anda : ");
        jmlTdkMasuk = input.nextInt();

        totalGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * ptgnGaji);
        System.out.println("\nTotal Gaji Yang Anda Terima Adalah Rp." + totalGaji + "\n");
    }
}
