package PhoneBookProject;

import java.util.Scanner;

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

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("1. 데이터 입력");
            System.out.println("2. 프로그램 종료");
            System.out.print("선택 : ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            if (choice == 2) break;

            System.out.print("이름 : ");
            String name = keyboard.nextLine();
            System.out.print("전화번호 : ");
            String phoneNumber = keyboard.nextLine();
            System.out.print("생년월일 : ");
            String birthday = keyboard.nextLine();

            // 인스턴스 생성
            PhoneInfo phoneInfo = new PhoneInfo(name, phoneNumber, birthday);

            System.out.println("입력된 정보 출력...");
            phoneInfo.showInfo();
        }

    }
}
