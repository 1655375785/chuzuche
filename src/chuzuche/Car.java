package chuzuche;

import java.util.Scanner;

public class Car extends Vehicle{
	Scanner input=new Scanner(System.in);
	public void  showName(int a){
		switch (a) {
		case 1:
			setName("别克商务");
			break;
		case 2:
			setName("宝马550i");
			break;
		case 3:
			setName("别克林荫大道");
			break;

		default:
			break;
		}
		
	}
	public void showMoney(int a){
		int []money={600,500,300};
		setZuMoney(money[a-1]);
	}
}
