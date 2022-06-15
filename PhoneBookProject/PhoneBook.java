package PhoneBookProject;

class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthday;

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = "---";
    }

    public PhoneInfo(String name, String phoneNumber, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public void showInfo (){
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
        System.out.println("생년월일 : " + birthday);
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        PhoneInfo phoneInfo1 = new PhoneInfo("홍성윤", "010-1111-1111", "2022-06-15");
        PhoneInfo phoneInfo2 = new PhoneInfo("홍성온", "010-1111-2222", "2022-06-15");
        PhoneInfo phoneInfo3 = new PhoneInfo("홍성주", "010-1111-3333", "2022-06-15");

        phoneInfo1.showInfo();
        phoneInfo2.showInfo();
        phoneInfo3.showInfo();
    }
}
