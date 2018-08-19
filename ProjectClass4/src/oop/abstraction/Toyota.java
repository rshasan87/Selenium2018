package oop.abstraction;

public class Toyota extends FlyingCar implements Car, ElectricCar {

	public void start() {
	   System.out.println("start the car");
	}
	public void stop() {
		System.out.println("press the break to stop the car");
	}

	public void wheel() {
		System.out.println("Car should run on wheels");
	}
	
	public void motorVehicle() {
		System.out.println("Run on engine");
	}
	public void engingRunByBattery() {
		System.out.println("Solar Panel gives enough power, so let's build electic car");
		
	}

	public void flyingFeatures() {
		System.out.println("It has flying features");
	}
	public void flyingSaucer() {
		System.out.println("This is flying Saucer");
	}

}
