package chuzuche;

import java.util.Scanner;

public class Trunk extends Vehicle{
	Scanner input=new Scanner(System.in);
	public void  showName(int a){
		String[]nam={"����16��"+"����16��"};
		
		setName(nam[a-1]);
	}
	public void showMoney(int a){
		
		int []money={800,1500};
		setZuMoney(money[a-1]);
	}
}
