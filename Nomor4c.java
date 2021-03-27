
package tugasalgomg4;
import java.util.Scanner;

public class Nomor4c {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Angka = ");
        int b = s.nextInt();
        
        int temp = 1;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp ++;
                if (temp == 10) {
                    temp = 0;
                }
            }
            System.out.println("");
        }

    }
    
}
