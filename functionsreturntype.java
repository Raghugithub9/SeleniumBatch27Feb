package OOPS;

public class functionsreturntype {

	public static void main(String[] args) {
		functionsreturntype f=new functionsreturntype();
		int d=f.add(100, 200);
System.out.println(d);
	}
	
	public int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}

}
