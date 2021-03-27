package tugasalgomg4;
import java.util.Scanner;

public class Nomor4e {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.println("Masukkan nilai = ");
        int n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n-(n-i)) ; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        for (int i = (n-1); i >= 1; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = (n - 1) + i - (n - 1); j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }   
    
}
