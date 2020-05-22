package designpatterns.structural.composite;

public class Company {
	public static void main(String[] args) {
		Employee dev1       = new Developer(100, "Juan", "Pro developer");
		Employee dev2       = new Developer(101, "Miriam", "Developer");
		Manager  engManager = new Manager("Mike", 25000);
		engManager.addEmployee(dev1);
		engManager.addEmployee(dev2);
		Employee dev3           = new Developer(102, "Tom", "Developer");
		Manager  generalManager = new Manager("Mark", 50000);
		generalManager.addEmployee(dev3);
		generalManager.addEmployee(engManager);
		generalManager.showEmployeeDetails();
	}
}
