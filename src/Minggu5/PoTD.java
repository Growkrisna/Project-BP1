package Minggu5;
import java.util.Scanner;

public class PoTD {

    public static void main(String[] args) { // main ini, kalau gk ada method main ini java bisa bingung kita mau mulai dari mana.
        int saldo = 57000, uangditarik, confirm, min = 100000;

        Scanner atm = new Scanner(System.in);

        System.out.println("==  ingin melakukan penarikan?  ==");
        System.out.println("==  Ketik 1. untuk penarikan");

        confirm = atm.nextInt();

        if (confirm == 1) {
            System.out.println("==  Masukan nominal yang ingin anda tarik");
        } else {
            System.out.println("==  End");
            System.exit(0);
        }

        uangditarik = atm.nextInt();

        if (uangditarik <= min) {
            System.out.println("==  Anda perlu menarik setidaknya Rp.100.000");
            uangditarik = atm.nextInt();
        }

        if (saldo < min) {
            System.out.println("==  Saldo anda tidak mencukupi");
        } else
            System.out.println("==  Proses sedang berjalan....");



    }

}
