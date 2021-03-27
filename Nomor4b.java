package TugasAlgoMg4;
import java.util.Scanner;

public class Nomor4b {

   
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       
        System.out.println("Masukkan angka akhir = ");
        int a = s.nextInt();
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
