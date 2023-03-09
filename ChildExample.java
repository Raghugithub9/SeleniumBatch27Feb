package OOPS;

public class ChildExample extends ParentExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildExample ce=new ChildExample();
		//ce.childtest();
		//ce.parenttest();
		//ce.Test();
		
		ParentExample pe1=new ChildExample();
		pe1.Test();
		
	}

	public void childtest() {
		System.out.println("Print Child Test");
	}
	
	public void Test() {
		System.out.println("ChildExample Testing");
		System.out.println("New");
	}
	
}
