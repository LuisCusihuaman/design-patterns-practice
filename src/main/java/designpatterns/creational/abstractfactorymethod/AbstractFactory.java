package designpatterns.creational.abstractfactorymethod;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}

class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		} else if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("Green")) {
			return new Green();
		} else if (color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}
}