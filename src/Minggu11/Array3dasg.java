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

        for (int i = 0; i < 3; i++) {
            System.out.println("BLOK " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.println("  Minggu " + (j + 1) + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.println("    Sensor " + (k + 1) + ": " + DATASUHU[i][j][k] + "°C");
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }

    }
}
