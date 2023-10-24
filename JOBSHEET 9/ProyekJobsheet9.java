import java.util.Scanner;

public class ProyekJobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tm, gd;
        String name, tgl, konfirmasi;
        String namaGd[] = { "Gedung Pernikahan", "Gedung Olahraga", "Gedung Seni", "Gedung Auditorium" };
        long tarif;

        while (true) {
            System.out.print("\nApakah Anda ingin memesan gedung (y/t)? ");
            konfirmasi = input.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("GEDUNG YANG TERSEDIA!");
                System.out.printf("%-5s%-20s\n", "No.", "Daftar Gedung");
                for (int i = 0; i < namaGd.length; i++) {
                    System.out.printf("%-5s%-20s\n", i + 1, namaGd[i]);
                }
                System.out.print("\nMasukkan Nomor Gedung yang akan dipesan : ");
                gd = input.nextInt();
                switch (gd) {
                    case 1:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Acara (DD-MM-YYY) : ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 900.");
                        System.out.println("Tarif yang harus anda bayar Rp.90000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 90000;
                        if (tm <= 900) {
                            System.out.println("\nAtas Nama       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 250.");
                        System.out.println("Tarif yang harus anda bayar Rp.25000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 25000;
                        if (tm <= 250) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[1]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 100.");
                        System.out.println("Tarif yang harus anda bayar Rp.10000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 10000;
                        if (tm <= 100) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[2]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 4:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 500.");
                        System.out.println("Tarif yang harus anda bayar Rp.50000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 50000;

                        if (tm <= 500) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[3]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.exit(0);
            } else {
                System.out.println("Maaf, pilihan anda salah! Silakan ulangi.");
            }
        }
    }
}