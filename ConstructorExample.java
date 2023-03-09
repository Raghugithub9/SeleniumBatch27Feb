package OOPS;

public class ConstructorExample {

public 	ConstructorExample() {
	System.out.println("Example for Constructor");
}

public 	ConstructorExample(String st) {
	System.out.println(st);
}
	public static void main(String[] args) {
		
		ConstructorExample ce1=new ConstructorExample();
		ConstructorExample ce2=new ConstructorExample("Selenium Test");
		ce1.add();
	}
public void add() {
	System.out.println("Add method");
}
	
}
