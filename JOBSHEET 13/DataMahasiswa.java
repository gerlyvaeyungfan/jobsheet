import java.util.Scanner;

public class DataMahasiswa {

    static int jumlahMahasiswa;
    static int jumlahMinggu;
    static int nilaiTertinggi = 0;
    static int mingguNilaiTertinggi = 0;
    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;


    public static void main(String[] args) {
        inputDataMahasiswa();
        tampilkanNilaiMahasiswa();
        lacakNilaiTertinggi();
        tampilMahasiswaNilaiTertimggi();
    }
    
    static void inputDataMahasiswa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        jumlahMinggu = input.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" +(i+1) +" : ");
            namaMahasiswa[i]=input.next();
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
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
        System.out.println("| Nama Mahasiswa |  Minggu ke-1   |  Minggu ke-2   |  Minggu ke-3   |  Minggu ke-4   |  Minggu ke-5   |  Minggu ke-6   |  Minggu ke-7   |");
        System.out.println("|================|================|================|================|================|================|================|================|");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("| ");
            System.out.printf("%-10s", namaMahasiswa[i]);
            System.out.print("     | ");
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
        System.out.println("-> Mahasiswa dengan nilai tertinggi adalah " + (namaMahasiswa[mahasiswaDenganNilaiTertinggi]) + " dengan nilai " + nilaiTertinggi +
                            " pada minggu ke-" + mingguNilaiTertinggi);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}