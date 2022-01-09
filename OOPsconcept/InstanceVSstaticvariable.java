package OOPsconcept;

public class InstanceVSstaticvariable {

	int I=10;
	static int s=20;
	public static void main(String[] args) {
		
		Function f1=new Function();
		Function f2=new Function();
		
		System.out.println(""+f1.I);
		System.out.println(""+f2.I);
		System.out.println(""+f1.s);

	}

} 
