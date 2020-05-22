package designpatterns.structural.decorator;
//abstract decorator
abstract class ShapeDecorator implements Shape {
	protected Shape decortedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decortedShape = decoratedShape;
	}

	public void draw() {
		//after delegates a other classes that implements shape interface
		decortedShape.draw();
	}
}
//Concrete decorator
class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decortedShape.draw();
		setRedBorder(decortedShape);
	}

	private void setRedBorder(Shape decortedShape) {
		System.out.println("Border Color: Red");
	}
}