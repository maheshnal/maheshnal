package OOPsconcept;

public class InstanceVariable {

	 int I=10;
	 static int s=20;
	
	void printValue()  
	{
		
	System.out.println(""+I);	
	}
	public static void main(String[] args) {
		
		Function f1=new Function();
		System.out.println(""+s);
		System.out.println(""+InstanceVariable.s);
		System.out.println();
	}

}
