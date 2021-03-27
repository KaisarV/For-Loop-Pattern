package tugasalgomg4;
import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan n = ");
        int n = s.nextInt();
        
        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            
              hasil = hasil + (i * 2 - 1);    
        }
        System.out.println("Hasil penjumlahan n bilangan ganjil adalah = " + hasil);
    
    
    }   
}
