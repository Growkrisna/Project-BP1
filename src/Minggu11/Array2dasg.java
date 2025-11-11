package Minggu11;

import java.util.*;

public class Array2dasg {
    public static void main(String[] args) {
        int terminal[][] = {{30,25,35},{20,18,22},{40,35,45},{15,10,12}};

//total terminal c
        int totalTerminalC = 0;
        for (int i = 0; i < terminal[2].length;i++){
            totalTerminalC = totalTerminalC + terminal[2][i];
        }
//rata-rata hari kedua
        double ratarata_day2 = 0;
        for (int l = 0;l < terminal.length;l++){
            ratarata_day2 += terminal[l][1];
        }
        ratarata_day2 /= terminal.length;

        System.out.println("Array penjualan tiket.");
        for (int i = 0; i < terminal.length; i++) {   // Loop rows
            for (int j = 0; j < terminal[i].length; j++) { // Loop columns
                System.out.print(terminal[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }


        System.out.println("\nTotal penjualan tiket di Terminal C: " + totalTerminalC);
        System.out.println("Rata-rata penjualan pada Hari 2: " + ratarata_day2);

    }
}
