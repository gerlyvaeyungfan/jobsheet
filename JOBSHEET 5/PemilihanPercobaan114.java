import java.util.Scanner;

public class PemilihanPercobaan114 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input13.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}