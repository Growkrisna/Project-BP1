package Minggu13;

public class method {
    public static void main(String[] args) {
        cetak();
        cetak2(3);
        cetak();
    }


    public static void cetak() {
        System.out.println("Method 1");
    }

    public static void cetak2(int n){
        for (int i = 1; i <= n; i++){
            System.out.println("Method 2");
        }
    }

}
