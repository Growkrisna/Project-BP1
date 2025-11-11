package Minggu11;
import java.util.*;

public class Sorting2 {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8,7,9};

        for (int i = 0; i < arr.length - 1 ;i++){
            boolean swapp = false;
            for (int l = 0; l < arr.length - i - 1 ;l++){
                if (arr[l] < arr[l + 1]){
                    int temp = arr[l];
                    arr[l] = arr[l + 1];
                    arr[l + 1] = temp;
                    swapp = true;
                }
            }
            if (!swapp) {
                break;
            }
        }
        System.out.println("Sorted array : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
