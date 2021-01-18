/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3;
import java.util.Scanner; //supaya program dapat menggunakan scanner
/**
 *
 * @author Intan
 */
public class LATIHAN3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); //membuat scanner baru
        int a,b,c; //deklarasi variabel
        System.out.println("Program menjumlahkan 2 Nilai"); //membuat judul
        System.out.print("Masukkan nilai a = "); //memberi instruksi kepada user untuk menginputkan nilai a
        a = masukan.nextInt(); //untuk menerima inputan nilai a dari keyboard 
        System.out.print("Masukkan nilai b = ");//memberi instruksi kepada user untuk menginputkan nilai b
        b = masukan.nextInt(); //untuk menerima inputan nilai b dari keyboard 
        System.out.print("Masukkan nilai c = "); //memberi instruksi kepada user untuk menginputkan nilai c
        c = masukan.nextInt(); //untuk menerima inputan nilai c dari keyboard 
        System.out.println(); //untuk memberi jarak
        System.out.println("Jumlah a + b = "+(jumlah(a,b))); //memberi hasil output dan mengalihkan program ke method jumlah bilangan a dan b
        System.out.println("Jumlah b + c = "+(jumlah(b,c))); //memberi hasil output dan mengalihkan program ke method jumlah bilangan b dan c
        System.out.println("Jumlah a + c = "+(jumlah(a,c))); //memberi hasil output dan mengalihkan program ke method jumlah bilangan a dan c
    }private static int jumlah (int a, int b){ //membuat method jumlah
        int hasil = a+b; //variabel hasil adalah jumlah dar kedua bilangan
        return hasil; //agar hasil dapat ditampilkan di bagian output
    }
}
