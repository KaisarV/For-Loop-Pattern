
package tugasalgomg4;
import java.util.Scanner;
public class Nomor4d {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan angka  = ");
        int a = s.nextInt();
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a-(a-i)); j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        for (int i = (a-1); i >= 1; i--) {
            for (int j = (a - 1) + i - (a - 1); j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
        
    }
    
}
