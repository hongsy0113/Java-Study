package PhoneBookProject;

import java.util.Scanner;

class PhoneInfo {
    protected String name;
    protected String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void showInfo (){
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
    }

}

class PhoneUnivInfo extends PhoneInfo {

    private String major;
    private int grade;

    public PhoneUnivInfo (String name, String phoneNumber, String major, int grade){
        super(name, phoneNumber);
        this.major = major;
        this.grade = grade;
    }

    public void showInfo(){
        System.out.println("이름 : " + super.name);
        System.out.println("전화번호 : " + super.phoneNumber);
        System.out.println("전공 : " + major);
        System.out.println("학년 : " + grade);
    }
}

class PhoneCompanyInfo extends PhoneInfo {
    private String company;

    public PhoneCompanyInfo(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public void showInfo(){
        System.out.println("이름 : " + super.name);
        System.out.println("전화번호 : " + super.phoneNumber);
        System.out.println("회사 : " + company);
    }
}

class PhoneBookManager {
    private final PhoneInfo[] phoneInfoArr = new PhoneInfo[100];
    int cnt = 0;
    Scanner keyboard = new Scanner(System.in);

    // 입력 받기 - 일반
    private PhoneInfo getInfoBasic (){
        System.out.print("이름 : ");
        String name = keyboard.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = keyboard.nextLine();

        return new PhoneInfo(name, phoneNumber);
    }

    // 입력받기 - 대학
    private PhoneInfo getInfoUniv(){
        System.out.print("이름 : ");
        String name = keyboard.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = keyboard.nextLine();
        System.out.print("전공: ");
        String major = keyboard.nextLine();
        System.out.print("학년 : ");
        int grade = keyboard.nextInt();

        return new PhoneUnivInfo(name, phoneNumber, major, grade);
    }

    // 입력받기 - 회사
    private PhoneInfo getInfoCompany(){
        System.out.print("이름 : ");
        String name = keyboard.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = keyboard.nextLine();
        System.out.print("회사: ");
        String company = keyboard.nextLine();


        return new PhoneCompanyInfo(name, phoneNumber, company);
    }



    // 저장
    public void save() {

        System.out.println("데이터 입력을 시작합니다..");

        System.out.println("1. 일반, 2. 대학, 3. 회사");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        switch (choice)
        {
            case 1:
                phoneInfoArr[cnt++] = getInfoBasic();
                break;
            case 2:
                phoneInfoArr[cnt++] = getInfoUniv();
                break;
            case 3:
                phoneInfoArr[cnt++] = getInfoCompany();
                break;
        }

//        System.out.print("이름 : ");
//        String name = keyboard.nextLine();
//        System.out.print("전화번호 : ");
//        String phoneNumber = keyboard.nextLine();
//        System.out.print("생년월일 : ");
//        String birthday = keyboard.nextLine();
//
//        phoneInfoArr [cnt++] = new PhoneInfo(name, phoneNumber);


        System.out.println("데이터 입력 완료");
    }

    // 검색
    public void search() {


        System.out.println("검색을 시작합니다..");
        System.out.println("검색할 이름을 입력하세요 ");
        String name = keyboard.nextLine();

        boolean find = false;

        for (int i = 0 ; i < cnt; i++) {
            if (phoneInfoArr[i].getName().compareTo(name) == 0) {
                phoneInfoArr[i].showInfo();
                find = true;
                break;
            }
        }
        if (find)
            System.out.println("검색이 완료되었습니다");
        else
            System.out.println("없는 이름입니다 ㅠ");
    }

    // 삭제
    public void remove() {
        System.out.println("삭제을 시작합니다..");
        System.out.println("삭제할 이름을 입력하세요 ");
        String name = keyboard.nextLine();
        int idx=0;
        boolean find = false;

        for (int i = 0 ; i < cnt; i++) {
            if (phoneInfoArr[i].getName().compareTo(name) == 0) {
                idx = i;
                find = true;
                break;
            }
        }
        if (find) {
            for (int i = idx; i < cnt - 1; i++) {
                phoneInfoArr[i] = phoneInfoArr[i + 1];
            }
            cnt--;
        }
        else System.out.println("없는 이름입니다!");

    }
}

public class PhoneBook {
    public static void main(String[] args) {

        PhoneBookManager phoneBookManager = new PhoneBookManager();

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.print("선택 : ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();

            if (choice == 1) phoneBookManager.save();
            else if (choice == 2) phoneBookManager.search();
            else if (choice == 3) phoneBookManager.remove();
            if (choice == 4) break;

        }

    }
}
