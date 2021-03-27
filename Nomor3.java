package tugasalgomg4;
import java.util.Scanner;

public class Nomor3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int fn;
        int fn_1;
        int fn_2;
        
        System.out.print("Nilai Fibonacci ke - ");
        int n = s.nextInt();
        
        fn_2 = 0;
        fn_1 = 1;
        fn = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Deret Fibonacci ke - " + i + " adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
       
}
 
