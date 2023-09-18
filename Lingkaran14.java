import java.util.Scanner;

public class Lingkaran14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        float phi = 3.14f;
        double keliling, luas;

        System.out.print("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();

        keliling = 2 * phi * r;
        luas = phi * r * r;
        System.out.println("\nKeliling : " + keliling);
        System.out.println("\nLuas     : " + luas);
    }
}