import java.util.Scanner; //menambahkan paket scanner untuk memasukkan input keyboard ke dalam program

public class SquareNumber { //nama file java
    public static void main(String[] args) { //method main java
        Scanner input = new Scanner(System.in); //membaca masukan dari output, dan menyimpannya ke dalam sistem

        System.out.print("Masukkan angka (Min. 3): ");  //memasukkan input number tipe integer ke dalam sistem kemudian disimpan
        int angka = input.nextInt();

        if (angka >=3){
            for (int i = 0; i < angka; i++) { //untuk i = 0, dengan kondisi i<input angka yang dimasukkan, sebagai baris di outerloop
                for (int j = 0; j < angka; j++) { //maka masuk ke perulangan dalam, disini deklarasi integer j = 0,
                    //karena ingin membuat iterasi perulangan dalam, iterasi akan dilakukan hingga kondisi j<angka bernilai false,
                    // kemudian j akan di increment, sebagai kolom tiap baris
                    if (i == 0 || i == angka - 1 || j == 0 || j == angka - 1) {
                        System.out.print(angka + " "); //output innerloop yang akan dicetak angka ditambah spasi apabila kondisi if terpenuhi,
                        //lalu menambahkan spasi
                    } else {
                        System.out.print("  "); //bagian selain kondisi luar, bagian dalam akan dicetak dengan spasi sebanyak 2 kali
                    }
                }
                System.out.println();//digunakan untuk mencetak baris baru, sebagai pemisah baris pertama yang
                //sudah dicetak dengan baris berikutnya
            }
        }
    }
}

