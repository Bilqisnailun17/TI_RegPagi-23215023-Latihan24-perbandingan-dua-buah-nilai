/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62818
 */
import java.util.Scanner;
public class latihan24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;
        
        do {
            System.out.println("========Program Perbandingan Nilai========");
            
            // Input nilai pertama
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();
            
            // Input nilai kedua
            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();
            
            // Membandingkan nilai
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            
            // Tanya user apakah ingin mengulang aktivitas
            System.out.print("Ulangi Aktivitas? (Ya/Tidak): ");
            ulang = scanner.next();
            
        } while (ulang.equalsIgnoreCase("Ya"));
        
        System.out.println("Program selesai.");
        scanner.close();
    }
}
    

