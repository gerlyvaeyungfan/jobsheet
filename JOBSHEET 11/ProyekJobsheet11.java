import java.util.Scanner;

public class ProyekJobsheet11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stepLogin;
        String inputUserAdmin, inputPwAdmin, inputUserMember, inputPwMember;
        int stepGd1, stepGd2, stepGd3, stepGd4;
        String kodeVeriv[] = {"01234", "12345", "23456", "34567", "45678", "56789", "67890"};
        String inputKodeMenu1, inputKodeMenu2;
        int tm, gd, menuGd1, menuGd2, menuGd3, menuGd4;
        String name, tgl, verivikasi;
        long tarif;
        String[] regUserMemb = new String[100];
        String[] regPwMemb = new String[100];
        int jmlUserMemb = 0;
        regUserMemb[jmlUserMemb] = "member";
        regPwMemb[jmlUserMemb] = "12345";
        jmlUserMemb++;
        String namaGd[][] = { 
            {"Gedung Pernikahan",  "900 Orang", "Rp. 90000"},
            {"Gedung Olahraga", "250 Orang", "Rp. 25000"},
            {"Gedung Kesenian", "100 Orang", "Rp. 10000"},
            {"Gedung Auditorium", "500 Orang", "Rp. 50000"}
        };
        String akun;
        System.out.println("SELAMAT DATANG DI WEBSITE BOOKING GDEUNG");
        System.out.println("Silahkan masuk untuk melanjutkan!");
        do {
            System.out.print("Apakah Anda sudah punya akun? (y/t) ");
            akun = input.next();
            if (akun.equals("t")){
                System.out.print("Masukkan username baru: ");
                String inputUserBaru = input.next();
                System.out.print("Masukkan password baru: ");
                String inputPwBaru = input.next();

                regUserMemb[jmlUserMemb] = inputUserBaru;
                regPwMemb[jmlUserMemb] = inputPwBaru;
                jmlUserMemb++;
                System.out.println("User baru berhasil terdaftar!");
            } else if (akun.equals("y")) {
                do {
                   System.out.println("*______________________________________________*");
                    System.out.println("|  Selamat Datang di Website Booking Gedung:)  |");
                    System.out.println("|----------------------------------------------|");
                    System.out.println("|        Silahkan pilih halaman login!         |");
                    System.out.println("|   1. Login Admin                             |");
                    System.out.println("|   2. Login Member                            |");
                    System.out.println("|   3. Keluar                                  |");
                    System.out.println("|______________________________________________|");
                    System.out.print("Masukkan Pilihan Anda : ");
                    stepLogin = input.nextInt();
                    if (stepLogin < 1 || stepLogin > 4) {
                        System.out.println("Mohon masukkan nomor antara 1 dan 4.");
                    }
                } while (stepLogin < 1 || stepLogin > 4);

                if (stepLogin==1) {
                    String[][] users = {
                        {"admin1", "admin111"},
                        {"admin2", "admin222"}
                    };
                    boolean userAdminValid;
                    int menuAdm;
                    do {
                        System.out.print("Masukkan username: ");
                        inputUserAdmin = input.next();
                        System.out.print("Masukkan password: ");
                        inputPwAdmin = input.next();
                        userAdminValid=false;
                        for (String[] user : users) {
                            if (user[0].equals(inputUserAdmin) && user[1].equals(inputPwAdmin)) {
                            userAdminValid = true;
                                break;
                            }
                        }
                        if (userAdminValid) {
                            System.out.println("Login berhasil!");
                            System.out.println("Selamat datang, Admin!");
                        } else {
                            System.out.println("Login gagal. Username atau password salah. Silakan coba lagi.");
                        }
                   } while (!userAdminValid);
                        System.out.println("1. lihat data member");
                        System.out.println("2. Keluar");
                        System.out.print("Masukkan Pilihan : ");
                        menuAdm=input.nextInt();
                        switch (menuAdm) {
                            case 1:
                                System.out.println("\nJumlah Member : "+jmlUserMemb );
                                System.out.println("User yang telah terdaftar :\n");
                                for (int i = 0; i < jmlUserMemb; i++) {
                                    System.out.println("Username : " + regUserMemb[i]);
                                    System.out.println("Password : " + regPwMemb[i]);
                                    System.out.println("---------------------------");
                                }
                            case 2:
                                System.exit(0);
                            }   
                } else if (stepLogin==2){
                    boolean userMemberValid;
                    do {
                        System.out.print("Masukkan username: ");
                        inputUserMember = input.next();
                        System.out.print("Masukkan password: ");
                        inputPwMember = input.next();
                        userMemberValid=false;
                        for (int i = 0; i < jmlUserMemb; i++) {
                            if (inputUserMember.equals(regUserMemb[i]) && inputPwMember.equals(regPwMemb[i])) {
                                userMemberValid = true;
                                break;
                            }
                        }
                        if (userMemberValid) {
                            System.out.println("Login berhasil!");
                            System.out.println("Selamat datang, Member!");
                        } else {
                            System.out.println("Login gagal. Username atau password salah. Silakan coba lagi.");
                        }
                    } while (!userMemberValid);

                    while (true) {
                        System.out.print("\nApakah Anda ingin memesan gedung (y/t)? ");
                        verivikasi = input.next();
                        if (verivikasi.equalsIgnoreCase("y")) {
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
                                        tarif = tm * 90000;
                                        if (tm > 900) {
                                            System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 900");
                                        } else if (tm < 1){
                                            System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                                        }
                                    } while (tm < 1 || tm > 900);
                                        System.out.println("Pilih Langkah Selanjutnya!");
                                        System.out.println("1. Bayar Sekarang");
                                        System.out.println("2. Beli Barang tambahan Lain");
                                        do {
                                            System.out.print("Masukkan Pilihan : ");
                                            stepGd1 = input.nextInt();
                                            if (stepGd1 < 1 || stepGd1 > 2) {
                                                System.out.println("Mohon masukkan nomor gedung antara 1 dan 2.");
                                            }
                                        } while (stepGd1 < 1 || stepGd1 > 2);
                                        int mtdBayarGd1;
                                        switch (stepGd1) {
                                            case 1:
                                                System.out.println("1. Bayar lewat BRI/BNI/BCA di no.rek 2341760195 a.n Gerly Vaeyungfan");
                                                System.out.println("2. Bayar lewat DANA/ShopeePay/LinkAja di no 085604054712 a.n Gerly Vaeyungfan");
                                                do {
                                                    System.out.print("Pilih Metode Pembayaran : ");
                                                    mtdBayarGd1 = input.nextInt();
                                                    if (mtdBayarGd1 < 1 || mtdBayarGd1 > 2) {
                                                        System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                                    }
                                                } while (mtdBayarGd1 < 1 || mtdBayarGd1 > 2);
                                                switch (mtdBayarGd1) {
                                                    case 1:
                                                        boolean isKodeValid = false;
                                                        do {
                                                            System.out.println("Kode Verifikasi ada di Mutasi Transfer");
                                                            System.out.print("Masukkan Kode Verivikasi : ");
                                                            inputKodeMenu1 = input.next();
                                                            isKodeValid = false;
                                                            for (String kode : kodeVeriv) {
                                                                if (inputKodeMenu1.equals(kode)) {
                                                                    isKodeValid = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!isKodeValid) {
                                                                System.out.println("Kode Verifikasi Salah. Silahkan coba lagi");
                                                            } else {
                                                                System.out.println("\nInformasi Pemesanan Anda!");
                                                                System.out.println("Atas Nama       : " + name);
                                                                System.out.println("Nama Gedung     : " + namaGd[0][0]);
                                                                System.out.println("Tanggal         : " + tgl);
                                                                System.out.println("Jumlah Tamu     : " + tm);
                                                                System.out.println("Total Biaya     : Rp." + tarif);
                                                            }
                                                        } while (!isKodeValid);
                                                            break;
                                                    case 2:
                                                        System.out.println("Masukkan Kode Verivikasi : ");
                                                        inputKodeMenu2=input.next();
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                    break;
                                            case 2:
                                                String brgTersediaGd1[][]={
                                                    {"Undangan Nikah", "Rp.5000/pcs"},
                                                    {"Catering", "Rp.30000/pcs"},
                                                    {"Souvenir", "Rp.25000/pcs"},
                                                    {"Dekorasi", "Rp.2500000"},
                                                };
                                                for (int i = 0; i < brgTersediaGd1.length; i++) {
                                                    System.out.print((i + 1) + ". ");
                                                    for (int j=0; j<brgTersediaGd1[i].length; j++){
                                                        System.out.print("  "+brgTersediaGd1[i][j]+"\t");
                                                    }
                                                    System.out.println();
                                                }      
                                                do {
                                                    System.out.print("Masukkan Pilihan Anda : ");
                                                    menuGd1 = input.nextInt();
                                                    if (menuGd1 < 1 || menuGd1 > 4) {
                                                        System.out.println("Mohon masukkan angka antara 1 dan 4.");
                                                    }
                                                } while (menuGd1 < 1 || menuGd1 > 4);
                                                int subMenu1gd1, subMenu2gd1, subMenu3gd1, subMenu4gd1;
                                                long hargaPil1gd1, hargaPil2gd1, hargaPil3gd1, hargaPil4gd1;
                                                switch (menuGd1) {
                                                    case 1:
                                                        System.out.print("Jumlah undangan yang ingin dipesan : ");
                                                        subMenu1gd1=input.nextInt();
                                                        hargaPil1gd1=subMenu1gd1*5000;
                                                        break;
                                                    case 2:
                                                    
                                                    case 3:

                                                    case 4:

                                                    default:
                                                        break;
                                                }
                                                break;
                                        }
                                        break;

                                case 2:
                                    System.out.print("Masukkan Nama Anda : ");
                                    name = input.next();
                                    System.out.print("Masukkan Tanggal Acara (DD-MM-YYY) : ");
                                    tgl = input.next();
                                    System.out.println("\nKapasitas Maksimal tamu 250.");
                                    System.out.println("Tarif yang harus anda bayar Rp.25000/tamu");
                                    do {
                                        System.out.print("Masukkan Jumlah Tamu : ");
                                        tm = input.nextInt();
                                        tarif = tm * 25000;
                                        if (tm > 250) {
                                            System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 250");
                                        } else if (tm < 1){
                                            System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                                        }
                                    } while (tm < 1 || tm > 250);
                                    System.out.println("Pilih Langkah Selanjutnya!");
                                    System.out.println("1. Bayar Sekarang");
                                    System.out.println("2. Beli Barang tambahan Lain");
                                    do {
                                        System.out.print("Masukkan Pilihan Anda : ");
                                        stepGd2 = input.nextInt();
                                        if (stepGd2 < 1 || stepGd2 > 2) {
                                            System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                        }
                                    } while (stepGd2 < 1 || stepGd2 > 2);
                                    int mtdBayarGd2;
                                    switch (stepGd2) {
                                        case 1:
                                            System.out.println("1. Bayar lewat BRI/BNI/BCA di no.rek 2341760195 a.n Gerly Vaeyungfan");
                                            System.out.println("2. Bayar lewat DANA/ShopeePay/LinkAja di no 085604054712 a.n Gerly Vaeyungfan");
                                            do {
                                                System.out.print("Masukkan Pilihan Anda : ");
                                                mtdBayarGd2 = input.nextInt();
                                                if (mtdBayarGd2 < 1 || mtdBayarGd2 > 2) {
                                                    System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                                }
                                            } while (mtdBayarGd2 < 1 || mtdBayarGd2 > 2);
                                            switch (mtdBayarGd2) {
                                                case 1:
                                                    boolean isKodeValid = false;
                                                    do {
                                                        System.out.println("Kode Verifikasi ada di Mutasi Transfer");
                                                        System.out.print("Masukkan Kode Verivikasi : ");
                                                        inputKodeMenu1 = input.next();
                                                        isKodeValid = false;
                                                        for (String kode : kodeVeriv) {
                                                            if (inputKodeMenu1.equals(kode)) {
                                                                isKodeValid = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!isKodeValid) {
                                                            System.out.println("Kode Verifikasi Salah. Silahkan coba lagi");
                                                        } else {
                                                            System.out.println("\nInformasi Pemesanan Anda!");
                                                            System.out.println("Atas Nama       : " + name);
                                                            System.out.println("Nama Gedung     : " + namaGd[1][0]);
                                                            System.out.println("Tanggal         : " + tgl);
                                                            System.out.println("Jumlah Tamu     : " + tm);
                                                            System.out.println("Total Biaya     : Rp." + tarif);
                                                        }
                                                    } while (!isKodeValid);
                                                    break;
                                                case 2:
                                                    System.out.println("Masukkan Kode Verivikasi : ");
                                                    inputKodeMenu2=input.next();
                                                    break;
                                                default:
                                                    break;
                                            }   
                                            break;
                                        case 2:
                                            String brgTersediaGd2[][]={
                                                {},
                                                {},
                                                {},
                                                {},
                                            };
                                            for (int i = 0; i < brgTersediaGd2.length; i++) {
                                                System.out.print((i + 1) + ". ");
                                                for (int j=0; j<brgTersediaGd2[i].length; j++){
                                                    System.out.print("  "+brgTersediaGd2[i][j]+"\t");
                                                }
                                                System.out.println();
                                            }
                                            System.out.print("Masukkan Pilihan Anda : ");
                                            menuGd2=input.nextInt();
                                            int subMenu1gd2, subMenu2gd2, subMenu3gd2, subMenu4gd2;
                                            long hargaPil1gd2, hargaPil2gd2, hargaPil3gd2, hargaPil4gd2;
                                            switch (menuGd2) {
                                                case 1:
                                                    System.out.print("Jumlah undangan yang ingin dipesan : ");
                                                    subMenu1gd2=input.nextInt();
                                                    hargaPil1gd2=subMenu1gd2*5000;
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                        break;

                                    case 3:
                                        System.out.print("Masukkan Nama Anda : ");
                                        name = input.next();
                                    System.out.print("Masukkan Tanggal Acara (DD-MM-YYY) : ");
                                    tgl = input.next();
                                    System.out.println("\nKapasitas Maksimal tamu 100.");
                                    System.out.println("Tarif yang harus anda bayar Rp.10000/tamu");
                                    do {
                                        System.out.print("Masukkan Jumlah Tamu : ");
                                        tm = input.nextInt();
                                        tarif = tm * 10000;
                                        if (tm > 100) {
                                            System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 100");
                                        } else if (tm < 1){
                                            System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                                        }
                                    } while (tm < 1 || tm > 100);
                                    System.out.println("Pilih Langkah Selanjutnya!");
                                    System.out.println("1. Bayar Sekarang");
                                    System.out.println("2. Beli Barang tambahan Lain");
                                    do {
                                        System.out.print("Masukkan Pilihan Anda : ");
                                        stepGd3 = input.nextInt();
                                        if (stepGd3 < 1 || stepGd3 > 2) {
                                            System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                        }
                                    } while (stepGd3 < 1 || stepGd3 > 2);
                                    int mtdBayarGd3;
                                    switch (stepGd3) {
                                        case 1:
                                            System.out.println("1. Bayar lewat BRI/BNI/BCA di no.rek 2341760195 a.n Gerly Vaeyungfan");
                                            System.out.println("2. Bayar lewat DANA/ShopeePay/LinkAja di no 085604054712 a.n Gerly Vaeyungfan");
                                            do {
                                                System.out.print("Masukkan Pilih Metode Pembayaran : ");
                                                mtdBayarGd3 = input.nextInt();
                                                if (mtdBayarGd3 < 1 || mtdBayarGd3 > 2) {
                                                    System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                                }
                                            } while (mtdBayarGd3 < 1 || mtdBayarGd3 > 2);
                                            switch (mtdBayarGd3) {
                                                case 1:
                                                    boolean isKodeValid = false;
                                                    do {
                                                        System.out.println("Kode Verifikasi ada di Mutasi Transfer");
                                                        System.out.print("Masukkan Kode Verivikasi : ");
                                                        inputKodeMenu1 = input.next();
                                                        isKodeValid = false;
                                                        for (String kode : kodeVeriv) {
                                                            if (inputKodeMenu1.equals(kode)) {
                                                                isKodeValid = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!isKodeValid) {
                                                            System.out.println("Kode Verifikasi Salah. Silahkan coba lagi");
                                                        } else {
                                                            System.out.println("\nInformasi Pemesanan Anda!");
                                                            System.out.println("Atas Nama       : " + name);
                                                            System.out.println("Nama Gedung     : " + namaGd[2][0]);
                                                            System.out.println("Tanggal         : " + tgl);
                                                            System.out.println("Jumlah Tamu     : " + tm);
                                                            System.out.println("Total Biaya     : Rp." + tarif);
                                                        }
                                                    } while (!isKodeValid);
                                                        break;
                                                case 2:
                                                    System.out.println("Masukkan Kode Verivikasi : ");
                                                    inputKodeMenu2=input.next();
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            String brgTersediaGd3[][]={
                                                {},
                                                {},
                                                {},
                                                {},
                                            };
                                            for (int i = 0; i < brgTersediaGd3.length; i++) {
                                                System.out.print((i + 1) + ". ");
                                                for (int j=0; j<brgTersediaGd3[i].length; j++){
                                                    System.out.print("  "+brgTersediaGd3[i][j]+"\t");
                                                }
                                                System.out.println();
                                            }
                                            System.out.print("Masukkan Pilihan Anda : ");
                                            menuGd3=input.nextInt();
                                            int subMenu1gd3, subMenu2gd3, subMenu3gd3, subMenu4gd3;
                                            long hargaPil1gd3, hargaPil2gd3, hargaPil3gd3, hargaPil4gd3;
                                            switch (menuGd3) {
                                                case 1:
                                                    System.out.print("Jumlah undangan yang ingin dipesan : ");
                                                    subMenu1gd3=input.nextInt();
                                                    hargaPil1gd3=subMenu1gd3*5000;
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                    }
                                    break;

                                case 4:
                                    System.out.print("Masukkan Nama Anda : ");
                                    name = input.next();
                                    System.out.print("Masukkan Tanggal Acara (DD-MM-YYY) : ");
                                    tgl = input.next();
                                    System.out.println("\nKapasitas Maksimal tamu 500.");
                                    System.out.println("Tarif yang harus anda bayar Rp.50000/tamu");
                                    do {
                                        System.out.print("Masukkan Jumlah Tamu : ");
                                        tm = input.nextInt();
                                        tarif = tm * 50000;
                                        if (tm > 500) {
                                            System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 500");
                                        } else if (tm < 1){
                                            System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                                        }
                                    } while (tm < 1 || tm > 500);
                                    System.out.println("Pilih Langkah Selanjutnya!");
                                    System.out.println("1. Bayar Sekarang");
                                    System.out.println("2. Beli Barang tambahan Lain");
                                    do {
                                        System.out.print("Masukkan Pilihan Anda : ");
                                        stepGd4 = input.nextInt();
                                        if (stepGd4 < 1 || stepGd4 > 2) {
                                            System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                        }
                                    } while (stepGd4 < 1 || stepGd4 > 2);
                                    int mtdBayarGd4;
                                    switch (stepGd4) {
                                        case 1:
                                            System.out.println("1. Bayar lewat BRI/BNI/BCA di no.rek 2341760195 a.n Gerly Vaeyungfan");
                                            System.out.println("2. Bayar lewat DANA/ShopeePay/LinkAja di no 085604054712 a.n Gerly Vaeyungfan");
                                            do {
                                                System.out.print("Pilih Metode Pembayaran : ");
                                                mtdBayarGd4 = input.nextInt();
                                                if (mtdBayarGd4 < 1 || mtdBayarGd4 > 2) {
                                                    System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                                }   
                                            } while (mtdBayarGd4 < 1 || mtdBayarGd4 > 2);
                                            switch (mtdBayarGd4) {
                                                case 1:
                                                    boolean isKodeValid = false;
                                                    do {
                                                        System.out.println("Kode Verifikasi ada di Mutasi Transfer");
                                                        System.out.print("Masukkan Kode Verivikasi : ");
                                                        inputKodeMenu1 = input.next();
                                                        isKodeValid = false;
                                                        for (String kode : kodeVeriv) {
                                                            if (inputKodeMenu1.equals(kode)) {
                                                                isKodeValid = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!isKodeValid) {
                                                            System.out.println("Kode Verifikasi Salah. Silahkan coba lagi");
                                                        } else {
                                                            System.out.println("\nInformasi Pemesanan Anda!");
                                                            System.out.println("Atas Nama       : " + name);
                                                            System.out.println("Nama Gedung     : " + namaGd[3][0]);
                                                            System.out.println("Tanggal         : " + tgl);
                                                            System.out.println("Jumlah Tamu     : " + tm);
                                                            System.out.println("Total Biaya     : Rp." + tarif);
                                                        }
                                                    } while (!isKodeValid);
                                                        break;
                                                case 2:
                                                    System.out.println("Masukkan Kode Verivikasi : ");
                                                    inputKodeMenu2=input.next();
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            String brgTersediaGd4[][]={
                                                {},
                                                {},
                                                {},
                                                {},
                                            };
                                            for (int i = 0; i < brgTersediaGd4.length; i++) {
                                                System.out.print((i + 1) + ". ");
                                                for (int j=0; j<brgTersediaGd4[i].length; j++){
                                                    System.out.print("  "+brgTersediaGd4[i][j]+"\t");
                                                }
                                                System.out.println();
                                            }
                                            System.out.print("Masukkan Pilihan Anda : ");
                                            menuGd4=input.nextInt();
                                            int subMenu1gd4, subMenu2gd4, subMenu3gd4, subMenu4gd4;
                                            long hargaPil1gd4, hargaPil2gd4, hargaPil3gd4, hargaPil4gd4;
                                            switch (menuGd4) {
                                                case 1:
                                                   System.out.print("Jumlah undangan yang ingin dipesan : ");
                                                    subMenu1gd4=input.nextInt();
                                                    hargaPil1gd4=subMenu1gd4*5000;
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                    }
                                    default:
                                        break;
                                }
                        } else if (verivikasi.equalsIgnoreCase("t")) {
                            System.out.print("Terima kasih! Selamat berjumpa kembali:)");
                            System.exit(0);
                        } else {    
                            System.out.println("Maaf, pilihan anda salah! Silakan ulangi.");
                        }
                        break;
                    }
                } else if (stepLogin==3){
                    System.out.println("Terima kasih.");
                    System.exit(0);
                }
            } else if (!akun.equals("y") || !akun.equals("t")){
                System.out.println("Pilihan tidak tersedia");
            }
        } while (!akun.equals("y") || !akun.equals("t"));
    }
}
