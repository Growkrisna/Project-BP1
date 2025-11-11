package Minggu11;

public class SortingSelection {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7,4,8,0,9,4,7,6,5};

        for (int y = 0; y < arr.length; y++){
            int minIndex = y;

            for(int t = y + 1; t < arr.length; t++){
                if (arr[t] < arr[minIndex]) {
                    minIndex = t;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[y];
            arr[y] = temp;
        }

        System.out.println("Sorted arrat : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
