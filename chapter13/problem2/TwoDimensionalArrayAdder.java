package chapter13.problem2;

public class TwoDimensionalArrayAdder {

    public static void addOneDArr(int [] arr, int add){
        for (int i=0; i<arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void addTwoDArr(int[][] arr, int add){
        for (int i = 0; i < arr.length; i++) {
            addOneDArr(arr[i], add);
        }
    }

    public static void showTwoDArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 4}
        };
        showTwoDArr(arr);
        addTwoDArr(arr, 10);
        showTwoDArr(arr);

    }
}
