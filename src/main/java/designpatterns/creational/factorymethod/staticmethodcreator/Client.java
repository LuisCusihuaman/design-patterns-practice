package designpatterns.creational.factorymethod.staticmethodcreator;

public class Client {
	public static void main(String[] args) {

		//get an object of Circle and call its draw method.
		Shape shape1 = ShapeFactory.getShape("CIRCLE");
		shape1.draw();
		//get an object of Rectangle and call its draw method.
		Shape shape2 = ShapeFactory.getShape("RECTANGLE");
		shape2.draw();
		//get an object of Square and call its draw method.
		Shape shape3 = ShapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}
