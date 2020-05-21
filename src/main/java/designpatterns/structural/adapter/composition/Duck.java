package designpatterns.structural.adapter.composition;

interface Duck {
	public void quack();

	public void fly();
}

class MallarDuck implements Duck {

	public void quack() {
		System.out.println("Quack");
	}

	public void fly() {
		System.out.println("I am flying");
	}
}
