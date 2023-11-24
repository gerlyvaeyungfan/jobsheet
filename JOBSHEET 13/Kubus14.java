import java.util.Scanner;

public class Kubus14 {

    public static double hitungVolumeKubus(double sisi) {
        double volume = Math.pow(sisi, 3);
        return volume;
    }
 
    public static double hitungLuasPermukaanKubus(double sisi) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = scanner.nextDouble();

        double volume = hitungVolumeKubus(sisiKubus);
        System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volume);

        double luasPermukaan = hitungLuasPermukaanKubus(sisiKubus);
        System.out.println("Luas permukaan kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaan);
    }
}