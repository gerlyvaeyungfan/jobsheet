import java.util.Scanner;

public class Kubus14 {

    // Fungsi untuk menghitung volume kubus
    public static double hitungVolumeKubus(double sisi) {
        double volume = Math.pow(sisi, 3);
        return volume;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaanKubus(double sisi) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }

    public static void main(String[] args) {
        // Membaca panjang sisi kubus dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = scanner.nextDouble();

        // Menghitung volume kubus
        double volume = hitungVolumeKubus(sisiKubus);
        System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volume);

        // Menghitung luas permukaan kubus
        double luasPermukaan = hitungLuasPermukaanKubus(sisiKubus);
        System.out.println("Luas permukaan kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaan);
    }
}
