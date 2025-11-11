package Minggu10;
import java.util.*;

public class Sorting1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilia = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Nilai "+ (i+1) + " = " );
            nilia[i] = sc.nextInt();
            }

            int max = nilia[0];
            int min = nilia[0];

        for (int i = 0; i < 5; i++){
            System.out.print(nilia[i] +"\n");
        }


        for (int i = 0; i < 5; i++) {
                if (nilia[i] > max){max = nilia[i];}
                if (nilia[i] < min){min = nilia[i];}
        }

        System.out.println("\nNilai tertinggi: " + max);
        System.out.println("Nilai terendah : " + min);


    }
}
