package Minggu8;
import java.util.*;

public class FinalProject {
    public static void main(String[] args) {

        Scanner well = new Scanner(System.in);
        boolean pesan = true;
        double totalharga = 0, harga = 0;

        while (pesan) {

            System.out.println("|| Selamat datang di Teh kota, Silahkan memilih pesanan ||");
            System.out.println("|| Kategori series");
            System.out.println("|| 1. Tea series, 2. Yakult series, 3. Blend series, 4. Coffee series" );
            System.out.print("Pilih kategori (1-4): ");
            int series = well.nextInt();

            switch (series) {
                case 1: // Tea Series
                    System.out.println("|| TEA SERIES ||");
                    System.out.println("1. Jasmine Tea");
                    System.out.println("2. Lemon Tea");
                    System.out.println("3. Passion Tea");
                    System.out.println("4. Leci Tea");
                    System.out.println("5. Teh Tarik Aceh");
                    System.out.println("6. Matcha");
                    System.out.println( "7. Grape Tea");
                    System.out.println("8. Apel Tea");
                    System.out.println("9. Melon Tea");
                    System.out.print("Pilih minuman (1-9): ");
                    int teapilih = well.nextInt();

                    switch(teapilih) {
                        case 1: System.out.println("Anda memesan: Jasmine Tea"); harga = 3000; break;
                        case 2: System.out.println("Anda memesan: Lemon Tea"); harga = 5000; break;
                        case 3: System.out.println("Anda memesan: Passion Tea"); harga = 5000; break;
                        case 4: System.out.println("Anda memesan: Leci Tea"); harga = 5000; break;
                        case 5: System.out.println("Anda memesan: Teh Tarik Aceh"); harga = 8000; break;
                        case 6: System.out.println("Anda memesan: Matcha"); harga = 12000; break;
                        case 7: System.out.println("Anda memesan: Grape Tea"); harga = 5000; break;
                        case 8: System.out.println("Anda memesan: Apel Tea"); harga = 5000; break;
                        case 9: System.out.println("Anda memesan: Melon Tea"); harga = 5000; break;
                        default: System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 2: // Yakult Series
                    System.out.println("|| YAKULT SERIES ||");
                    System.out.println("1. Yakult Strawberry");
                    System.out.println("2. Yakult Leci");
                    System.out.println("3. Yakult Orange");
                    System.out.println("4. Yakult Melon");
                    System.out.print("Pilih minuman (1-4): ");
                    int yakultpilih = well.nextInt();

                    switch(yakultpilih) {
                        case 1: System.out.println("Anda memesan: Yakult Strawberry"); harga = 8000; break;
                        case 2: System.out.println("Anda memesan: Yakult Leci"); harga = 8000; break;
                        case 3: System.out.println("Anda memesan: Yakult Orange"); harga = 8000; break;
                        case 4: System.out.println("Anda memesan: Yakult Melon"); harga = 8000; break;
                        default: System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 3: // Blend Series
                    System.out.println("|| BLEND SERIES ||");
                    System.out.println("1. Silverqueen");
                    System.out.println("2. Bubble Gum");
                    System.out.println("3. Taro");
                    System.out.println("4. Red Velvet");
                    System.out.println("5. Tiramisu");
                    System.out.println("6. Cookies & Cream");
                    System.out.println("7. Choco Avocado");
                    System.out.println("8. Ketan Hitam");
                    System.out.print("Pilih minuman (1-8): ");
                    int blendpilih = well.nextInt();

                    switch(blendpilih) {
                        case 1: System.out.println("Anda memesan: Silverqueen"); harga = 10000; break;
                        case 2: System.out.println("Anda memesan: Bubble Gum"); harga = 10000; break;
                        case 3: System.out.println("Anda memesan: Taro"); harga = 10000; break;
                        case 4: System.out.println("Anda memesan: Red Velvet"); harga = 10000; break;
                        case 5: System.out.println("Anda memesan: Tiramisu"); harga = 10000; break;
                        case 6: System.out.println("Anda memesan: Cookies & Cream"); harga = 10000; break;
                        case 7: System.out.println("Anda memesan: Choco Avocado"); harga = 10000; break;
                        case 8: System.out.println("Anda memesan: Ketan Hitam"); harga = 10000; break;
                        default: System.out.println("Pilihan tidak valid!");
                    }
                    break;

                case 4: // Coffee Series
                    System.out.println("|| COFFEE SERIES ||");
                    System.out.println("1. Vietnam Coffee");
                    System.out.println("2. Creamy Machiato");
                    System.out.println("3. Avocado Coffee");
                    System.out.println("4. Vanila Latte");
                    System.out.print("Pilih minuman (1-4): ");
                    int coffeepilih = well.nextInt();

                    switch(coffeepilih) {
                        case 1: System.out.println("Anda memesan: Vietnam Coffee"); harga = 10000; break;
                        case 2: System.out.println("Anda memesan: Creamy Machiato"); harga = 12000; break;
                        case 3: System.out.println("Anda memesan: Avocado Coffee"); harga = 15000; break;
                        case 4: System.out.println("Anda memesan: Vanila Latte"); harga = 15000; break;
                        default: System.out.println("Pilihan tidak valid!");
                    }
                    break;

                default:
                    System.out.println("Kategori tidak valid!");
            }

            System.out.println("|| Masukan Jumlah pesanan : ");
            int jumlah = well.nextInt();
            totalharga += harga * jumlah;
            harga = 0;

            System.out.println("Apakah ingin memesan lagi? (ya/tidak): ");
            String jawaban = well.next();

            if (jawaban.equalsIgnoreCase("tidak")) {
                pesan = false;
                System.out.println("Total yang harus dibayar: Rp " + totalharga);
                System.out.println("Terima kasih telah berbelanja di Teh Kota!");
            }
            System.out.println();
        }
    }
}