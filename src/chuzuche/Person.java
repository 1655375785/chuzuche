package chuzuche;

import java.util.Scanner;

public class Person {
	Scanner input=new Scanner(System.in);
	public void inputName(){
		String name=input.next();
	}
	public int inputChoice(){
		int n=input.nextInt();
		return n;
	}
	public int inputTime(int days){
		 days=input.nextInt();
		 return days;
	}
}
