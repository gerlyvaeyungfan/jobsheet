//Nama kelompok :
//Aprilia Putri Anggraeni 	(2341760043)
//Gerly Vaeyungfan 		    (2341760195)
//Jaden Natha Kautsar 		(2341760068)

import java.util.Scanner;

public class ProyekJobsheet4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tgl, bln, thn, tm;
        String name, gd;

        System.out.print("Masukkan nama Anda   : ");
        name = scanner.nextLine();
        System.out.print("Masukkan nama gedung : ");
        gd = scanner.nextLine();
        System.out.print("Masukkan tanggal     : ");
        tgl = scanner.nextInt();
        System.out.print("Masukkan bulan       : ");
        bln = scanner.nextInt();
        System.out.print("Masukkan tahun       : ");
        thn = scanner.nextInt();
        System.out.print("Masukkan jumlah tamu : ");
        tm = scanner.nextInt();

        System.out.println("\nNota pemesanan Anda!");
        System.out.println("Nama        : " + name + "\nGedung      : " + gd + "\nTanggal     : " + tgl + "-" + bln +
                "-" + thn + "\nJumlah Tamu : " + tm);

    }
}