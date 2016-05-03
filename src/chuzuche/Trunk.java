package chuzuche;

import java.util.Scanner;

public class Trunk extends Vehicle{
	Scanner input=new Scanner(System.in);
	public void  showName(int a){
		String[]nam={"少于16座"+"大于16座"};
		
		setName(nam[a-1]);
	}
	public void showMoney(int a){
		
		int []money={800,1500};
		setZuMoney(money[a-1]);
	}
}
