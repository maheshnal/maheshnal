package OOPsconcept;

public class Bike {

	static int wheels=2;
	String color=""; 
	public static void main(String[] args) {
		Bike RoyalEnfield=new Bike();
		Bike R15=new Bike();
		Bike duke=new Bike();

		System.out.println("no of wheels"+RoyalEnfield.wheels);
		System.out.println("no of wheels"+R15.wheels);
		System.out.println("no of wheels"+duke.wheels);
	}

}
