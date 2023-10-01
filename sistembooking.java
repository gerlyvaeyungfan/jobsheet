//Nama kelompok :
//Aprilia Putri Anggraeni 	(2341760043)
//Gerly Vaeyungfan 		    (2341760195)
//Jaden Natha Kautsar 		(2341760068)

import java.util.Scanner;

public class sistembooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tgl, bln, thn, tm;
        String name;

        System.out.println("SELAMAT DATANG!");
        System.out.println("\nGEDUNG YANG TERSEDIA!");
        System.out.println("\n1. Gedung Pernikahan");
        System.out.println("2. Gedung Olahraga");
        System.out.println("3. Gedung Seni");
        System.out.println("4. Gedung Auditorium");
        System.out.print("\nMasukkan Nomor Gedung yang akan dipesan : ");
        int gd = input.nextInt();

        if (gd == 1) {

            System.out.print("Masukkan Nama Anda    : ");
            name = input.next();
            System.out.print("Masukkan Tanggal Sewa : ");
            tgl = input.nextInt();
            System.out.print("Masukkan Bulan sewa   : ");
            bln = input.nextInt();
            System.out.print("Masukkan Tahun Sewa   : ");
            thn = input.nextInt();
            System.out.print("Masukkan Jumlah Tamu  : ");
            tm = input.nextInt();

            System.out.println("\nNama Anda       : " + name);
            System.out.println("Nama Gedung     : Gedung Pernikahan");
            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
            System.out.println("Jumlah Tamu     : " + tm);
        } else if (gd == 2) {
            System.out.print("Masukkan Nama Anda    : ");
            name = input.next();
            System.out.print("Masukkan Tanggal Sewa : ");
            tgl = input.nextInt();
            System.out.print("Masukkan Bulan sewa   : ");
            bln = input.nextInt();
            System.out.print("Masukkan Tahun Sewa   : ");
            thn = input.nextInt();
            System.out.print("Masukkan Jumlah Tamu  : ");
            tm = input.nextInt();

            System.out.println("\nNama Anda       : " + name);
            System.out.println("Nama Gedung     : Gedung Olahraga");
            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
            System.out.println("Jumlah Tamu     : " + tm);
        } else if (gd == 3) {
            System.out.print("Masukkan Nama Anda    : ");
            name = input.next();
            System.out.print("Masukkan Tanggal Sewa : ");
            tgl = input.nextInt();
            System.out.print("Masukkan Bulan sewa   : ");
            bln = input.nextInt();
            System.out.print("Masukkan Tahun Sewa   : ");
            thn = input.nextInt();
            System.out.print("Masukkan Jumlah Tamu  : ");
            tm = input.nextInt();

            System.out.println("\nNama Anda       : " + name);
            System.out.println("Nama Gedung     : Gedung Seni");
            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
            System.out.println("Jumlah Tamu     : " + tm);
        } else if (gd == 4) {
            System.out.print("Masukkan Nama Anda    : ");
            name = input.next();
            System.out.print("Masukkan Tanggal Sewa : ");
            tgl = input.nextInt();
            System.out.print("Masukkan Bulan sewa   : ");
            bln = input.nextInt();
            System.out.print("Masukkan Tahun Sewa   : ");
            thn = input.nextInt();
            System.out.print("Masukkan Jumlah Tamu  : ");
            tm = input.nextInt();

            System.out.println("\nNama Anda       : " + name);
            System.out.println("Nama Gedung     : Gedung Auditorium");
            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
            System.out.println("Jumlah Tamu     : " + tm);
        }

    }
}