import java.util.Scanner;

public class WhileKelipatan14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float rataRata = 0;
        int kelipatan;
        int total = 0;
        int counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                i++;
            }
        }
        rataRata = total / counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.println("Rata-rata : " + rataRata);
    }
}