import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat (int x, int y){
        if (y == 0){
            return (1);
        } else {
            return (x * hitungPangkat(x, y-1));
        }
    }

    static void cetakDeretPangkat(int x, int y) {
        System.out.print("hitungPangkat(" + x + "," + y + ") dicetak ");
        for (int i = 1; i <= y; i++) {
            System.out.print(x);
            if (i < y) {
                System.out.print("x");
            } else {
                System.out.print("x1 = " + hitungPangkat(x, y));
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = sc.nextInt();
        cetakDeretPangkat(bilangan, pangkat);
        System.out.println("Hasil dari "+bilangan+" pangkat "+pangkat+" adalah "+hitungPangkat(bilangan, pangkat));
    }
}
