package chapter14.problem1;

// 기본 연료 자동차
class Car{
    int gasolineGauge;

    public Car (int gasoline) {
        System.out.println("Car 생성자 호출");
        gasolineGauge = gasoline;
    }
}

// 하이브리드 자동차
class HybridCar extends Car {
    int electricGauge;

    public HybridCar (int gasoline, int electric) {
        super(gasoline);
        System.out.println("HybridCar 생성자 호출");
        electricGauge = electric;
    }
}

// 하이브리드 워터카
class HybridWaterCar extends HybridCar {
    int waterGauge;

    public HybridWaterCar(int gasoline, int electric, int water) {
        super(gasoline, electric);
        System.out.println("HybridWaterCar 생성자 호출");
        waterGauge = water;
    }

    public void showCurrentGauge(){
        System.out.println("잔여 가솔린 : " + gasolineGauge);
        System.out.println("잔여 전기량 : " + electricGauge);
        System.out.println("잔여 워터량 : " + waterGauge);
    }
}

public class CarInherit {
    public static void main(String[] args) {
        HybridWaterCar hybridWaterCar = new HybridWaterCar(10, 100, 1000);
    }

}
