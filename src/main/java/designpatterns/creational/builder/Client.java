package designpatterns.creational.builder;

public class Client {
	public static void main(String[] args) {
		System.out.println("***Builder Pattern Demo***");
		Director         director     = new Director();
		BuilderInterface carBuilder   = new Car();
		BuilderInterface motorBuilder = new MotorCycle();
		director.construct(carBuilder);
		Product theBestCar = carBuilder.getVehicle();
		theBestCar.show();
		System.out.println();
		//making a motorcycle
		director.construct(motorBuilder);
		Product theBestMoto = motorBuilder.getVehicle();
		theBestMoto.show();
	}
}
