package designpatterns.creational.factorymethod.concretecreator;


public class Client {
	public static void main(String[] args) {

		//get an object of Circle and call its draw method.
		Shape shape1 = new ShapeFactory().getShape("CIRCLE");
		shape1.draw();
		//get an object of Circle and call its draw method.
		Shape shape2 = new ShapeFactory().getShape("RECTANGLE");
		shape2.draw();
		//get an object of Circle and call its draw method.
		Shape shape3 = new ShapeFactory().getShape("SQUARE");
		shape3.draw();
	}
}
