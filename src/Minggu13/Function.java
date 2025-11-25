package Minggu13;
import java.util.*;

public class Function {
    public static int hitungjadi(int harian, int masuk){
        int gaji = harian * masuk;
        return gaji;
    }

    public static void main(String[] args) {
        int jg = hitungjadi(100000,20);
        System.out.println("Gaji : " + jg);
        System.out.println("Gaji : " + hitungjadi(125000, 20));
    }


}
