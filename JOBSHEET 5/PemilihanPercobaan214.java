import java.util.Scanner;

public class PemilihanPercobaan214 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = input13.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = input13.nextFloat();
        System.out.print("Nilai UAS : ");
        float kuis = input13.nextFloat();
        System.out.print("Nilai UAS : ");
        float tugas = input13.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi " : "Tidak Remidi";

        if (total > 80 && total <= 100) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message + " dan Nilai huruf adalah A");
        } else if (total > 73) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message + " dan Nilai huruf adalah B+");
        } else if (total > 65) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message + " dan Nilai huruf adalah B");
        } else if (total > 60) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message + " dan Nilai huruf adalah C+");
        } else if (total > 50) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message + " dan Nilai huruf adalah C");
        } else if (total > 39) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message + " dan Nilai huruf adalah D");
        } else if (total <= 39) {
            System.out.println("Nilai akhir = " + total + " sehingga " + message + " dan Nilai huruf adalah E");
        }
    }
}
