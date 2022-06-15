package chapter11;

class Person2 {
    private int perID;
    private int milID;

    public Person2(int pID, int mID) {
        perID = pID;
        milID = mID;
    }
    public Person2(int pID) {
        perID = pID;
        milID = 0;
    }
    public void showInfo() {
        System.out.println("민번 : " + perID);
        if (milID != 0)
            System.out.println("군번 : " + milID);
        else
            System.out.println("군과 관계 없음 \n");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Person2 man = new Person2(913412, 123123);
        Person2 woman = new Person2(4123123);
        man.showInfo();
        woman.showInfo();
    }
}
