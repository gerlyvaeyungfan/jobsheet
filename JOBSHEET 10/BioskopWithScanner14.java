import java.util.Scanner;
public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int baris, kolom, pilihan;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan (1/2/3): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null){
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                        } else {
                            System.out.println("Kursi sudah ditempati oleh " + penonton[baris-1][kolom-1]);
                            System.out.print("Silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Maaf bari/kolom kursi tidak tersedia. ");
                   }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("%d-%d: %s\n", i + 1, j + 1, penonton[i][j]);
                            } else {
                                System.out.printf("%d-%d: ***\n", i+1, j+1);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
}
