import java.util.Scanner;

public class PemilihanPercobaan114 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input13.nextInt();

        if (angka == 1)
            System.out.println("Angka " + angka + " bilangan ganjil");
        else if (angka == 2)
            System.out.println("Angka " + angka + " bilangan genap");
        else
            System.out.println("Masukkan Angka yang benar");
    }
}
