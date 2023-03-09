package OOPS;

import AccessModifiers.DefaultExample;
import AccessModifiers.PrivateExample;
import AccessModifiers.ProtectedExample;

public class Test {

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
		//pe.add();
		
		DefaultExample de=new DefaultExample();
		//de.test1();
		de.test2();
		
		ProtectedExample pe1=new ProtectedExample();
		//pe.print();

	}

}
