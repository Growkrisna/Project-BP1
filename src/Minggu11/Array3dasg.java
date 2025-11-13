package Minggu11;
import java.util.*;
public class Array3dasg {
    public static void main(String[] args) {
        double[][][] DATASUHU = {
                {
                    {27.5, 25.0, 26.7, 28.2, 27.8},
                    {19.0, 19.3, 18.9, 19.1, 18.7}
            }, {
                    {20.1, 20.5, 21.2, 20.8, 20.3},
                    {20.3, 20.7, 21.0, 20.5, 20.2}
            }, {
                    {17.8, 18.2, 17.9, 18.1, 17.7},
                    {18.0, 18.3, 18.1, 18.2, 17.9}
            }
        };

        for (int minggu = 0; minggu < 2; minggu++) {
            System.out.println("| MINGGU " + (minggu + 1) + "                                  |");
            System.out.println("+----------+------------+------------+------------+");

            for (int sensor = 0; sensor < 5; sensor++) {
                System.out.printf("| Sensor %d |", sensor + 1);
                for (int blok = 0; blok < 3; blok++) {
                    System.out.printf("  %6.1f°C  |", DATASUHU[blok][minggu][sensor]);
                }
                System.out.println();
            }
            System.out.println("+----------+------------+------------+------------+");
        }

        System.out.println("Suhu Ruang 2, Minggu 1, Sensor 3 = " + DATASUHU[1][0][2] + "°C");

        double total = 0;
        for (int i = 0; i < 3 ;i++){
            for(int j = 0; j < 2 ;j++){
                for(int k = 0;k < 5;k++){
                    total = total + DATASUHU[i][j][k];
                }
            }
        }

        System.out.println("Rata-rata = " + (total/30) + "°C");


    }
}
