import java.util.Scanner;

public class Segitiga14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.println("Masukkan alas:");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        
        luas = (float) (alas * 0.5f * tinggi);
        System.out.println("Luas segitigas: " + luas);
    }
}