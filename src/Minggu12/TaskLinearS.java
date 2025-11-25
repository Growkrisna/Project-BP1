package Minggu12;

public class TaskLinearS {
    public static void main(String[] args) {
        int[] arr = {12, 7, 3, 9 ,15, 20};
        int target = 9;

        TaskLinearS(arr, target);
    }

    public static void TaskLinearS(int[] arr ,int target) {

        boolean found = false;
        int array = arr.length;
        for (int i = 0; i < array ;i++ ) {
            if (arr[i] == target){
                System.out.println("Target di temukan di array " + i + " (iterasi ke " + (i + 1) +" )");
                found = true;
            }
            if (!found){
                System.out.println("Target tidak ditemukan di array " + i + " (iterasi ke " + (i + 1) +" )");
            }
        }

    }
}
