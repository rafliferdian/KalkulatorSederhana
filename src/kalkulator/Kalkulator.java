/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float bil1,bil2, hasil;
        
        System.out.println("--- Kalkulator Sederhana ---\n");
        
        System.out.print("Masukkan bilangan 1 : ");
        bil1 = input.nextFloat();
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = input.nextFloat();
        
        System.out.println("\nPilih operator yang akan digunakan : ");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.print("Masukkan no pilihan anda : ");
        int operator = input.nextInt();

        switch (operator) {
            case 1: hasil = bil1 + bil2;
                System.out.println(bil1+" + "+bil2+" = "+hasil);
                break;
            case 2:
                hasil = bil1 - bil2;
                System.out.println(bil1+" - "+bil2+" = "+hasil);
                break;
            case 3:
                hasil = bil1 * bil2;
                System.out.println(bil1+" * "+bil2+" = "+hasil);
                break;
            case 4:
                hasil = bil1 / bil2;
                System.out.println(bil1+" / "+bil2+" = "+hasil);
                break;
            case 5:
                hasil = bil1 % bil2;
                System.out.println(bil1+" mod "+bil2+" => "+hasil);
                break;
            default:
                System.out.println("\nMohon Maaf, Pilihan tidak ditemukan");
                break;
            }
    
    }
}
