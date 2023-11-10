import java.util.Scanner; //menambahkan paket scanner untuk memasukkan input dari output keyboard ke dalam program

public class TriangleNumber { //nama file java
    public static void main(String[] args) {//method main java
        Scanner input = new Scanner(System.in);//membaca masukan dari output, dan menyimpannya ke dalam sistem

        System.out.print("Masukkan angka (Min. 3) : "); //Menampilkan pesan untuk input angka minimal 3
        int number = input.nextInt(); //memasukkan input int number ke dalam sistem kemudian disimpan

        if (number >=3){ 
            for (int i = 0; i < (number); i++) { //untuk i = 0, dengan kondisi i<input yang dimasukkan
                for (int j = (number-1); j>i; j--) { //maka masuk ke perulangan dalam, disini j = number-1,
                    //karena ingin membuat iterasi perulangan dalam yang pertama hanya berada di tempat paling kanan,
                    //dengan kata lain input yang dimasukkan misalnya 5, maka 5-1 hasilnya 4 iterasi yang dilakukan
                    //innerloop hingga kondisi j>i, kemudia j akan di decrement, hasilnya akan jadi 4, lalu iterasi
                    //akan terus dilakukan hinggan j>i false
                    System.out.print(" ");//ini adalah output innerloop yang akan dicetak
                }//inner loop level 2
                for (int k = 0; k <= i; k++) { //karena memiliki level yang sama dan tidak ada karakter pemisa,
                //maka iterasi akan dilakukan berdekatan dengan iterasi outer yang pertama
                System.out.print(k+1);//program akan menampilkan baris k=0, k+1, maka akan mengasilkan angka 1,
                //kemudian hasil k akan di increment menjadi 2, karena kondisi k=2 false maka perulangan akan
                //false dan keluar ke outer loop yg pertama
                }//inner loop level 2
                System.out.println();//digunakan untuk mencetak baris baru, sebagai pemisah baris pertama yang
                //sudah dicetak dengan baris berikutnya
            }//outer loop level 1
        }
    }
}

