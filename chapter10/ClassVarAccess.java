package chapter10;

class AccessWay {
    static int num = 0;

    AccessWay() {
        incrCnt();
    }
    public void incrCnt() {
        num ++ ; // 방법1
    }
}

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.num ++; // 방법2
        AccessWay.num++; // 방법3
        System.out.println("num = " + AccessWay.num);
    }
}
