import java.util.Scanner; //menambahkan paket scanner untuk memasukkan input keyboard ke dalam program

public class TriangleStar { //nama file java
    public static void main(String[] args) { //method main java
        Scanner input = new Scanner(System.in); //membaca masukan dari output, dan menyimpannya ke dalam sistem

        System.out.print("Masukkan Nilai (Min. 5) : "); //memasukkan input number tipe integer ke dalam sistem kemudian disimpan
        int number = input.nextInt();//menyimpan nilai int yang dimasukkan

        if (number >= 5){
            for (int i = (number); i > 0; i--) { // untuk i = (number) yang diinputkan, memenuhi kondisi > 0, maka inner loop akan diiterasi
                for (int j = 0; j < i; j++) {//untuk j=0, dan kondisi j<i terpenuhi, maka statement akan dijalankan hingga bernilai false
                    System.out.print("*");//"*" adalah statement yang akan dicetak sebanyak j<i, hingga false, kemudian j akan diincrement,
                    //lalu program innerloop akan kembali melakukan iterasi outerloop, dengen mendcrement input i = (number)
                }
                System.out.println();//digunakan untuk mencetak baris baru, sebagai pemisah baris pertama yang
                //sudah dicetak dengan baris berikutnya
            }
        }
    }
}
