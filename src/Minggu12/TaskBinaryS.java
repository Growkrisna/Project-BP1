package Minggu12;

public class TaskBinaryS {
    public static final int TaskBinaryS (int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int iterasi = 0;

        while(left <= right) {
            iterasi++;
            int mid = left + (right - left) / 2;

            System.out.println("Iterasi ke-" + iterasi + ":");
            System.out.println("  low = " + left + " (array[" + left + "] = " + arr[left] + ")");
            System.out.println("  mid = " + mid + " (array[" + mid + "] = " + arr[mid] + ")");
            System.out.println("  high = " + right + " (array[" + right + "] = " + arr[right] + ")");

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
        int[] arr = {5, 10, 15 , 20, 25, 30, 35};
        int target = 5;

        int result = TaskBinaryS(arr, target);

        if (result != -1) {
            System.out.println("Ditemukan pada index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
