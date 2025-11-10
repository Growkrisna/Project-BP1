package Minggu10;

public class Array1d {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};
        int numa = num.length;
        System.out.println(numa);

        num[4] = 10;

        if(num[4] < numa){
            num[3] = 15;
        }

        System.out.println(num[3]);

    }
}
