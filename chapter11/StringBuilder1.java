package chapter11;

public class StringBuilder1 {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMN";

        StringBuilder strB = new StringBuilder(str);

        strB.reverse();

        System.out.println(strB);

    }
}
