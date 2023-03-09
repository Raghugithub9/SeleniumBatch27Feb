package OOPS;

public class LocalandGlobalVariables {

	static int c=300;//global variable
	
	public static void main(String[] args) {
		int a=100;//local variable
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		LocalandGlobalVariables lg=new LocalandGlobalVariables();
		lg.add();

	}
	
	
	public void add() {
		int b=200;//local variable
		System.out.println(b);
		//System.out.println(a);
		System.out.println(c);
		System.out.println("Add");
	}

}
