package Minggu12;

public class Bsearch {

    public static int Bsearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15 , 20, 25,  30,35, 40,45, 50,55, 60,65, 70,75};
        int target = 5;

        int result = Bsearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
