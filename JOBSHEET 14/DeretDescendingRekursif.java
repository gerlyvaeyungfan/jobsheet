import java.util.Scanner;

public class DeretDescendingRekursif {

    static void fungsiRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            fungsiRekursif(n - 1);
        }
    }

    static void fungsiIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("||> Masukkan nilai n : ");
        int n = input.nextInt();

        System.out.print("||> Deret Descending Menggunakan Rekursif : ");
        fungsiRekursif(n);

        System.out.print("\n||> Deret Descending Menggunakan Iteratif : ");
        fungsiIteratif(n);

        input.close();
    }
}
