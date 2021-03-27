package tugasalgomg4;

import java.util.Scanner;

public class Nomor5 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int lebar;
        int tinggi;
        int tebal;
        
        System.out.println("Masukkan Lebar = ");
        lebar = s.nextInt();
        System.out.println("Masukkan Tinggi = ");
        tinggi = s.nextInt();
        System.out.println("Masukkan Tebal = ");
        tebal = s.nextInt();
                
               
        for (int i = 1; i <= 2; i++) {
            for (int bintang = 1; bintang <= lebar; bintang++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= (tinggi - 4); i++) {
            for (int j = 1; j <= tebal; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (lebar - (tebal * 2)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= tebal; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 2; i++) {
            for (int bintang = 1; bintang <= lebar; bintang++) {
                System.out.print("*");
            }
            System.out.println("");
        } 
        
    }    
}
