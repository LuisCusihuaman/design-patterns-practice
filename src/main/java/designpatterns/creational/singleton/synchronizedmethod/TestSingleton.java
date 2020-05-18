package designpatterns.creational.singleton.synchronizedmethod;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.setData(55);
		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());

		//Get another reference to the singleton
		s = null;
		s = Singleton.getInstance();
		System.out.println("First reference: " + s);
		System.out.println("Secondary data value is: " + s.getData());
	}
}
