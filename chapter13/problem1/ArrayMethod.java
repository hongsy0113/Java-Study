package chapter13.problem1;

import java.util.Scanner;

public class ArrayMethod {
    public static int minValue(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxValues(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("배열 길이 입력");
        int len = keyboard.nextInt();
        keyboard.nextLine();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = keyboard.nextInt();
        }

        System.out.println(minValue(arr));
        System.out.println(maxValues(arr));
        System.out.println(arr);

    }

}
