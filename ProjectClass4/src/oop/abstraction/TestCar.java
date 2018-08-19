package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota();
        car.start();
        car.wheel();
        car.stop();
        
        Car.fly();
     
        Toyota camry = new Toyota();
        camry.motorVehicle();
        camry.engingRunByBattery();
        
        ElectricCar model3 = new Toyota();
        model3.engingRunByBattery();
        
        BMW series5 = new BMW();
        series5.start();
        series5.wheel();
        series5.stop();
        
        FlyingCar kittyHawk = new Toyota();
        kittyHawk.flyingFeatures();
        kittyHawk.flyingSaucer();
        kittyHawk.autoPilot();
        
	}

}
