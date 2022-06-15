package chapter13.problem2;

public class ShiftArray {

    public static void shiftArray(int[][] arr){

        int [] lastRow = arr[arr.length-1];

//        arr[0] = arr[arr.length-1];
        int [] temp;
        for (int i = 1; i < arr.length ; i--){
            temp = arr[i];
            arr[i] = arr[i-1];

        }
    }


    public static void main(String[] args) {

    }
}
