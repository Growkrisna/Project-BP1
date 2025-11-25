package Minggu13;

import java.util.*;

public class kasir {

    static Scanner sc = new Scanner(System.in);

    public static int menu(){

        int pilih = 0;
        System.out.println("Toko Laris");
        System.out.println("1. Beras  2. Minyak  3. Telor  ");
        System.out.println("4. Exit");
        System.out.println("Pilih = ");
        pilih = sc.nextInt();
        return pilih;
    }

    public static boolean login(String user, int pin) {
        if (user.equalsIgnoreCase("kasir") && pin == 111) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean login = false;
        String usr;
        int p = 0;
        int pil;

        do {
            System.out.print("User = ");
            usr = sc.next();
            System.out.print("PIN = ");
            p = sc.nextInt();
            login = login(usr, p);

        } while (!login);

        System.out.println("\nWelcome :D");
        System.out.println("Login berhasil! Sistem kasir siap digunakan.");

        sc.close();

        if (login){
            pil = menu();
        }
    }
}