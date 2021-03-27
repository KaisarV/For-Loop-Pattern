package tugasalgomg4;

import java.util.Scanner;

public class Nomor6 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan Tinggi Pohon Natal = ");
        int tinggi = s.nextInt();


        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= (tinggi - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= tinggi - 2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }    
}
