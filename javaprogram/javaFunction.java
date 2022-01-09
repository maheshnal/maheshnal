package javaprogram;

import java.util.Scanner;

public class javaFunction {
	
	 static int printAdd(int x, int y) {
		System.out.println("the sum is "+(x+y));
		return x+y;
	}

	public static void main(String[] args) {
		
		System.out.println("enter 2 nos");
 		Scanner  sc=new Scanner(System.in);
 		
 		int a=sc.nextInt();
 		int b=sc.nextInt();
		printAdd(a,b);//calling a function
		
	}
	

}
