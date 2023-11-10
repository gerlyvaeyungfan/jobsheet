import java.util.Scanner;
public class ProyekJobsheet11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tm, gd;
        long tarif;
        String name, tgl, konfirmasi;
        String namaGd[][] = { 
            {"Gedung Pernikahan",  "900 Orang", "Rp. 90000"},
            {"Gedung Olahraga", "250 Orang", "Rp. 25000"},
            {"Gedung Kesenian", "100 Orang", "Rp. 10000"},
            {"Gedung Auditorium", "500 Orang", "Rp. 50000"}
        };
        while (true) {
            System.out.print("\nApakah Anda ingin memesan gedung (y/t)? ");
            konfirmasi = input.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("GEDUNG YANG TERSEDIA!");
                System.out.printf("%-5s%-20s\n", "No.", "Nama Gedung\t  Maks Tamu\t  Tarif");
                for (int i = 0; i < namaGd.length; i++) {
                    System.out.print((i + 1) + ". ");
                    for (int j=0; j<namaGd[i].length; j++){
                        System.out.print("  "+namaGd[i][j]+"\t");
                    }
                    System.out.println();
                }
                do {
                    System.out.print("\nMasukkan Nomor Gedung yang akan dipesan : ");
                    gd = input.nextInt();
                
                    if (gd < 1 || gd > 4) {
                        System.out.println("Mohon masukkan nomor gedung antara 1 dan 4.");
                    }
                } while (gd < 1 || gd > 4);
                
                switch (gd) {
                    case 1:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Acara (DD-MM-YYY) : ");
                        tgl = input.next();
                        System.out.println("\nKapasitas Maksimal tamu 900.");
                        System.out.println("Tarif yang harus anda bayar Rp.90000/tamu");
                        do {
                            System.out.print("Masukkan Jumlah Tamu : ");
                            tm = input.nextInt();
                            if (tm > 900) {
                                System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 900");
                            } else if (tm < 1){
                                System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                            }
                        } while (tm < 1 || tm > 900);
                        tarif = tm * 90000;
                            System.out.println("\nInformasi Pemesanan Anda!");
                            System.out.println("Atas Nama       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[0][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        break;
                    case 2:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 250.");
                        System.out.println("Tarif yang harus anda bayar Rp.25000/tamu");
                        do {
                            System.out.print("Masukkan Jumlah Tamu : ");
                            tm = input.nextInt();
                            if (tm > 250) {
                                System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 250");
                            } else if (tm < 1){
                                System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                            }
                        } while (tm < 1 || tm > 250);
                        tarif = tm * 25000;
                            System.out.println("\nInformasi Pemesanan Anda!");
                            System.out.println("Atas Nama       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[1][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        break;
                    case 3:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 100.");
                        System.out.println("Tarif yang harus anda bayar Rp.10000/tamu");
                        do {
                            System.out.print("Masukkan Jumlah Tamu : ");
                            tm = input.nextInt();
                            if (tm > 100) {
                                System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 100");
                            } else if (tm < 1){
                                System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                            }
                        } while (tm < 1 || tm > 100);
                        tarif = tm * 10000;
                            System.out.println("\nInformasi Pemesanan Anda!");
                            System.out.println("Atas Nama       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[2][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        break;
                    case 4:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 500.");
                        System.out.println("Tarif yang harus anda bayar Rp.50000/tamu");
                        do {
                            System.out.print("Masukkan Jumlah Tamu : ");
                            tm = input.nextInt();
                            if (tm > 500) {
                                System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 500");
                            } else if (tm < 1){
                                System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                            }
                        } while (tm < 1 || tm > 500);
                        tarif = tm * 50000;
                            System.out.println("\nInformasi Pemesanan Anda!");
                            System.out.println("Atas Nama       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[3][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.print("Terima kasih! Selamat berjumpa kembali:)");
                System.exit(0);
            } else {
                System.out.println("Maaf, pilihan anda salah! Silakan ulangi.");
            }
        }
    }
}

