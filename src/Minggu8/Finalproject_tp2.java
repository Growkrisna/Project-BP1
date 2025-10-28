package Minggu8;
import java.util.*;

class FinalProject_tp2 {
    public static void main(String[] args) {
        Scanner well = new Scanner(System.in);
        double totalharga = 0;

        boolean Program = true;
        while (Program) {
            System.out.println("|| Selamat datang di Teh Kota ||");
            System.out.println("|| 1. Tea series     || 2. Yakult series ||");
            System.out.println("|| 3. Blend series   || 4. Coffee series ||");
            System.out.println("|| 5. Keluar & Bayar ||");
            System.out.print("|| Pilih kategori (1-5): ");

            int kategori = well.nextInt();

            if (kategori == 5) {
                Program = false;
                continue;
            }

            boolean tambahLagi = true;
            while (tambahLagi) {
                // Pilih minuman
                double harga = 0;
                String nama = "";

                if (kategori == 1) {
                    System.out.println("||          TEA SERIES         ||");
                    System.out.println("|| 1. Jasmine Tea     (3K)    ||");
                    System.out.println("|| 2. Lemon Tea       (5K)    ||");
                    System.out.println("|| 3. Passion Tea     (5K)    ||");
                    System.out.println("|| 4. Leci Tea        (5K)    ||");
                    System.out.println("|| 5. Teh Tarik Aceh  (8K)    ||");
                    System.out.println("|| 6. Matcha          (12K)   ||");
                    System.out.println("|| 7. Grape Tea       (5K)    ||");
                    System.out.println("|| 8. Apel Tea        (5K)    ||");
                    System.out.println("|| 9. Melon Tea       (5K)    ||");
                    System.out.print("|| Pilih minuman (1-9): ");
                    int pilih = well.nextInt();

                    if (pilih == 1) { nama = "Jasmine Tea"; harga = 3000; }
                    else if (pilih == 2) { nama = "Lemon Tea"; harga = 5000; }
                    else if (pilih == 3) { nama = "Passion Tea"; harga = 5000; }
                    else if (pilih == 4) { nama = "Leci Tea"; harga = 5000; }
                    else if (pilih == 5) { nama = "Teh Tarik Aceh"; harga = 8000; }
                    else if (pilih == 6) { nama = "Matcha"; harga = 12000; }
                    else if (pilih == 7) { nama = "Grape Tea"; harga = 5000; }
                    else if (pilih == 8) { nama = "Apel Tea"; harga = 5000; }
                    else if (pilih == 9) { nama = "Melon Tea"; harga = 5000; }
                    else {
                        System.out.println("|| Pilihan salah!");
                        continue;
                    }
                }
                else if (kategori == 2) {
                    System.out.println("||        YAKULT SERIES       ||");
                    System.out.println("|| 1. Yakult Strawberry (8K) ||");
                    System.out.println("|| 2. Yakult Leci       (8K) ||");
                    System.out.println("|| 3. Yakult Orange     (8K) ||");
                    System.out.println("|| 4. Yakult Melon      (8K) ||");
                    System.out.print("|| Pilih minuman (1-4): ");
                    int pilih = well.nextInt();

                    if (pilih == 1) { nama = "Yakult Strawberry"; harga = 8000; }
                    else if (pilih == 2) { nama = "Yakult Leci"; harga = 8000; }
                    else if (pilih == 3) { nama = "Yakult Orange"; harga = 8000; }
                    else if (pilih == 4) { nama = "Yakult Melon"; harga = 8000; }
                    else {
                        System.out.println("|| Pilihan salah!");
                        continue;
                    }
                }
                else if (kategori == 3) {
                    System.out.println("||         BLEND SERIES       ||");
                    System.out.println("|| 1. Silverqueen      (10K) ||");
                    System.out.println("|| 2. Bubble Gum       (10K) ||");
                    System.out.println("|| 3. Taro             (10K) ||");
                    System.out.println("|| 4. Red Velvet       (10K) ||");
                    System.out.println("|| 5. Tiramisu         (10K) ||");
                    System.out.println("|| 6. Cookies & Cream  (10K) ||");
                    System.out.println("|| 7. Choco Avocado    (10K) ||");
                    System.out.println("|| 8. Ketan Hitam      (10K) ||");
                    System.out.print("|| Pilih minuman (1-8): ");
                    int pilih = well.nextInt();

                    if (pilih == 1) { nama = "Silverqueen"; harga = 10000; }
                    else if (pilih == 2) { nama = "Bubble Gum"; harga = 10000; }
                    else if (pilih == 3) { nama = "Taro"; harga = 10000; }
                    else if (pilih == 4) { nama = "Red Velvet"; harga = 10000; }
                    else if (pilih == 5) { nama = "Tiramisu"; harga = 10000; }
                    else if (pilih == 6) { nama = "Cookies & Cream"; harga = 10000; }
                    else if (pilih == 7) { nama = "Choco Avocado"; harga = 10000; }
                    else if (pilih == 8) { nama = "Ketan Hitam"; harga = 10000; }
                    else {
                        System.out.println("|| Pilihan salah!");
                        continue;
                    }
                }
                else if (kategori == 4) {
                    System.out.println("||        COFFEE SERIES       ||");
                    System.out.println("|| 1. Vietnam Coffee   (10K) ||");
                    System.out.println("|| 2. Creamy Machiato  (12K) ||");
                    System.out.println("|| 3. Avocado Coffee   (15K) ||");
                    System.out.println("|| 4. Vanila Latte     (15K) ||");
                    System.out.print("|| Pilih minuman (1-4): ");
                    int pilih = well.nextInt();

                    if (pilih == 1) { nama = "Vietnam Coffee"; harga = 10000; }
                    else if (pilih == 2) { nama = "Creamy Machiato"; harga = 12000; }
                    else if (pilih == 3) { nama = "Avocado Coffee"; harga = 15000; }
                    else if (pilih == 4) { nama = "Vanila Latte"; harga = 15000; }
                    else {
                        System.out.println("|| Pilihan salah!");
                        continue;
                    }
                }
                else {
                    System.out.println("|| Kategori tidak valid!");
                    break;
                }

                System.out.print("|| Jumlah " + nama + ": ");
                int jumlah = well.nextInt();

                double subtotal = harga * jumlah;
                totalharga += subtotal;

                System.out.println("|| ✓ " + nama + " x" + jumlah + " = Rp " + subtotal);
                System.out.println("|| Total sementara: Rp " + totalharga);

                System.out.print("|| Tambah item di kategori ini? (ya/tidak): ");
                String jawab = well.next();

                if (jawab.equalsIgnoreCase("tidak")) {
                    tambahLagi = false;
                }
            }
        }


        System.out.println("|| Total bayar: Rp " + totalharga);

        System.out.println("|| Terima kasih!              ||");

        well.close();
    }
}