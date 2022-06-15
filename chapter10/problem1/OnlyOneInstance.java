package chapter10.problem1;

class SimpleNumber {
    int num = 0;
    private SimpleNumber() {} // 생성자가 private
    public void addNum (int n) {num += n;}
    public void showNum() {
        System.out.println(num);
    }
    static SimpleNumber simpleNumberInst = null; // static 메서드는 static 변수만 접근 가능하므로 static 변수로 설정
    public static SimpleNumber getSimpleNumberInst() {
        if (simpleNumberInst == null) {
            simpleNumberInst = new SimpleNumber();
            return simpleNumberInst;
        }
        else {
            return simpleNumberInst;
        }
    }
 }

public class OnlyOneInstance {
    public static void main(String[] args) {
        SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
        num1.addNum(20);

        SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
        num2.addNum(30);

        num1.showNum();
        num2.showNum();
    }
}
