import java.util.Scanner;

public class ProyekJobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tgl, bln, thn, tm, gd;
        String name;
        String konfirmasi;
        String namaGd[] = { "Gedung Pernikahan", "Gedung Olahraga", "Gedung Seni", "Gedung Auditorium" };

        while (true) {
            System.out.print("\nApakah Anda ingin memesan gedung (y/t)? ");
            konfirmasi = input.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("GEDUNG YANG TERSEDIA!");
                System.out.println("1. Gedung Pernikahan (Kapasitas Maks 900 orang)");
                System.out.println("2. Gedung Olahraga (Kapasitas Maks 250 orang)");
                System.out.println("3. Gedung Seni (Kapasitas Maks 100 orang)");
                System.out.println("4. Gedung Auditorium (Kapasitas Maks 500 orang)");

                System.out.print("\nMasukkan Nomor Gedung yang akan dipesan : ");
                gd = input.nextInt();
                switch (gd) {
                    case 1:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa : ");
                        tgl = input.nextInt();
                        System.out.print("Masukkan Bulan sewa : ");
                        bln = input.nextInt();
                        System.out.print("Masukkan Tahun Sewa : ");
                        thn = input.nextInt();
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();

                        if (tm <= 900) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[0]);
                            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                            System.out.println("Jumlah Tamu     : " + tm);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa : ");
                        tgl = input.nextInt();
                        System.out.print("Masukkan Bulan sewa : ");
                        bln = input.nextInt();
                        System.out.print("Masukkan Tahun Sewa : ");
                        thn = input.nextInt();
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();

                        if (tm <= 250) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[1]);
                            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                            System.out.println("Jumlah Tamu     : " + tm);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa : ");
                        tgl = input.nextInt();
                        System.out.print("Masukkan Bulan sewa : ");
                        bln = input.nextInt();
                        System.out.print("Masukkan Tahun Sewa : ");
                        thn = input.nextInt();
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();

                        if (tm <= 100) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[2]);
                            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                            System.out.println("Jumlah Tamu     : " + tm);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 4:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa : ");
                        tgl = input.nextInt();
                        System.out.print("Masukkan Bulan sewa : ");
                        bln = input.nextInt();
                        System.out.print("Masukkan Tahun Sewa : ");
                        thn = input.nextInt();
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();

                        if (tm <= 500) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[3]);
                            System.out.println("Tanggal         : " + tgl + " - " + bln + " - " + thn);
                            System.out.println("Jumlah Tamu     : " + tm);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }
        }
    }
}