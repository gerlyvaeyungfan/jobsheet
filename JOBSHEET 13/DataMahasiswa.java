import java.util.Scanner;

public class DataMahasiswa {

    static int jumlahMahasiswa = 5;
    static int jumlahMinggu = 7;
    static int nilaiTertinggi = 0;
    static int mingguNilaiTertinggi = 0;
    static String nama;
    static int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

    static void main(String[] args) {
        namaMahasiswa(nama);
        jumlahNilaiMahasiswa();
        tampilkanNilaiMahasiswa();
        lacakNilaiTertinggi();
        tampilMahasiswaNilaiTertimggi();
    }
    
    static void namaMahasiswa(String nama){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahaiswa : ");
        nama = input.next();
    }
    
    static void jumlahNilaiMahasiswa() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
        }
    }

    static void tampilkanNilaiMahasiswa() {
        System.out.println("._______________________________________________________________________________________________________________________________________.");
        System.out.println("|                                                                                                                                       |");
        System.out.println("|                                                                 DATA NILAI MAHASISWA                                                  |");
        System.out.println("|                                                                                                                                       |");
        System.out.println("|=======================================================================================================================================|");
        System.out.println("|                |  Minggu ke-1   |  Minggu ke-2   |  Minggu ke-3   |  Minggu ke-4   |  Minggu ke-5   |  Minggu ke-6   |  Minggu ke-7   |");
        System.out.println("|================|================|================|================|================|================|================|================|");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            namaMahasiswa(nama);
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.format("%-15d", nilaiMahasiswa[i][j]);
                if (j < jumlahMinggu) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
        System.out.println("|________________|________________|________________|________________|________________|________________|________________|________________|");
    }

    static void lacakNilaiTertinggi() {
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguNilaiTertinggi = j + 1;
                }
            }
        }
        System.out.println("-> Nilai tertinggi adalah " + nilaiTertinggi + " pada minggu ke-" + mingguNilaiTertinggi);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }

    static void tampilMahasiswaNilaiTertimggi() {
        int nilaiTertinggi = 0;
        int mahasiswaDenganNilaiTertinggi = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaDenganNilaiTertinggi = i;
                }
            }
        }
        System.out.println("-> Mahasiswa dengan nilai tertinggi adalah mahasiswa ke-" + (mahasiswaDenganNilaiTertinggi + 1) + " dengan nilai " + nilaiTertinggi +
                            " pada minggu ke-" + mingguNilaiTertinggi);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}