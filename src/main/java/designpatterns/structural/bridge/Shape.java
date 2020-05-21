package designpatterns.structural.bridge;

abstract class Shape {
	protected ColorInterface color;

	protected Shape(ColorInterface c) {
		this.color = c;
	}

	abstract void drawShape(int border);

	abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

	protected Triangle(ColorInterface c) {
		super(c);
	}

	//Implementer-spefic methods
	@Override
	void drawShape(int border) {
		System.out.println("This Triangle is colored with ");
		color.fillWithColor(border);
	}

	@Override
	void modifyBorder(int border, int increment) {
		System.out.println("\nNow we are chaning the border length " + increment + " times");
		border += increment;
		drawShape(border);
	}
}

class Rectangle extends Shape {

	protected Rectangle(ColorInterface c) {
		super(c);
	}

	//Implementer-spefic methods
	@Override
	void drawShape(int border) {
		System.out.println("This Rectangle is colored with ");
		color.fillWithColor(border);
	}

	@Override
	void modifyBorder(int border, int increment) {
		System.out.println("\nNow we are chaning the border length " + increment + " times");
		border += increment;
		drawShape(border);
	}
}