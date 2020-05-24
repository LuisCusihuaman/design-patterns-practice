package designpatterns.behavioral.state;

abstract class RemoteControl {
	public abstract void pressSwitch(TV context);
}

class On extends RemoteControl {
	@Override
	public void pressSwitch(TV context) {
		System.out.println("I am alredy On. Going to be Off now");
		context.setState(new Off());
	}
}

class Off extends RemoteControl {
	@Override
	public void pressSwitch(TV context) {
		System.out.println("I am alredy Off. Going to be On now");
		context.setState(new On());
	}
}