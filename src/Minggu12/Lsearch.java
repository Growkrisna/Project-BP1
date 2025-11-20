package Minggu12;

public class Lsearch {
        public static void Lsearch(int[] arr, int target) {

        boolean found = false;
        int ar = arr.length;
        for (int i = 0; i < ar ;i++){
            if (arr[i] == target){
                System.out.println("Target found at index "+ i );
                found = true;
            }
            if(!found) {
                System.out.println("Target not found in the array.");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,20,40,50};
        int target = 20;
        Lsearch(arr, target);
    }
}

