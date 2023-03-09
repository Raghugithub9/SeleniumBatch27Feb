package OOPS;

public class functionsparameter {

	public static void main(String[] args) {
		functionsparameter fp=new functionsparameter();
		fp.add();
		fp.test("Selenium",'@');
		fp.test("Java",'#');
		fp.test("Testing");
		fp.test('V');
		fp.add1(123, 234);
		fp.add1(1234, 1000);
		fp.add1(13, 2340);
		fp.add1(3233, 2334);
		fp.add1(1223, 2344);
	}

	public void test(char c) {
		System.out.println(c);
		System.out.println('A');
	}
	
public void test(String st,char c) {
	System.out.println(st+c);
}

public void test(String st) {
	System.out.println(st);
}

public void add() {
	int a=100;
	int b=200;
	int c=a+b;
	System.out.println(c);
	System.out.println("Add");
}

public void add1(int i,int j){
	int k=i+j;
	System.out.println(k);
}




	
}
