package Tugas_UKL;

import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Input data 
        System.out.println("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.println("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.println("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.println("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        //Hitung volume paket
        double volume = panjang * lebar *tinggi;

        // Tentukan tarif per kg 
        double tarifPerKg;
        if (jarak <= 10) {
            tarifPerKg = 4250;
        } else {
            tarifPerKg = 6000;
        }
        
        // Hitung biaya awal berdasarkan berat dan jarak 
        double totalBiaya = berat * tarifPerKg;

        // Tambahan biaya jika volume lebih dari 100000 cm^3 (100 liter)
        if (volume > 100000) {
            totalBiaya += 50000;
        }
        
        // Tampilkan hasil 
        System.out.println("\n=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Berat paket : " + berat + " kg");
        System.out.println("Jarak       : " + jarak +" km");
        System.out.println("volume      : " + volume + " cm^3");
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
        

        


    

    
    }
    
}
