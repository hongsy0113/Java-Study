package chapter11;

class Person {
    private int perID;
    private int milID;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Person(int perID, int milID, int bYear, int bMonth, int bDay){
        this.perID = perID;
        this.milID = milID;
        birthYear = bYear;
        birthMonth = bMonth;
        birthDay = bDay;
    }
    public Person(int pID, int bYear, int bMonth, int bDay) {
        this(pID, 0, bYear, bMonth, bDay);
    }
    public void showInfo() {
        System.out.println("민번 : " + perID);
        System.out.println("생년월일 : " + birthYear + "/" + birthMonth + "/" + birthDay);
        if (milID != 0)
            System.out.println("군번 : " + milID + '\n');
        else
            System.out.println("군과 관계 업승ㅁ \n");

    }

}


public class CstOverloading {
    public static void main(String[] args) {
        Person man = new Person(123141, 1231, 1998, 1, 13);
        Person woman = new Person(123123, 1999, 11, 7);
        man.showInfo();
        woman.showInfo();
    }
}
