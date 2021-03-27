package tugasalgomg4;
import java.util.Scanner;

public class Nomor2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan akhir = ");
        int bilangan_akhir = s.nextInt();
        
        
     
      int hasil = 0;
        for (int i = 1; i <= bilangan_akhir; i++) {
            if (i % 2 == 1) {
                hasil = hasil + i;
            }
        }
        System.out.println("hasil penjumlahan bilangan ganjil sampai bilangan tersebut adalah = " + hasil);
          
    }   
}
