package OOPS;

public class FunctionsExample {

	public static void main(String[] args) {
		
		addition();
		FunctionsExample.addition();
		//Mul(); Can't call non static function
		//FunctionsExample.Mul();
		
	FunctionsExample fe1=new FunctionsExample();
	FunctionsExample fe2=new FunctionsExample();
	FunctionsExample fe3=new FunctionsExample();
	FunctionsExample fe4=new FunctionsExample();
	
	fe1.Mul();
	fe2.Mul();
	new FunctionsExample().Mul();
	
	//object - new FunctionsExample();
	//fe - object reference
		
	}
	
	
	public static void addition() {
		System.out.println("Additional Function");
	}
	
	public void Mul() {
		System.out.println("Multiplication Function");
	}

	
}
