package designpatterns.creational.abstractfactorymethod;


public class Client {
	public static void main(String[] args) {
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//get an object of shape circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		//call a draw method of shape circle
		shape1.draw();
		//...
	}
}
