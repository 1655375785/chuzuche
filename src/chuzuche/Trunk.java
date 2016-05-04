package chuzuche;

import java.util.Scanner;

public class Trunk extends Vehicle{
	public Trunk(String Name) {
		super(Name);		
	}
	private int seatCount=0;
	public double   rentFee(int day){
//		Scanner input=new Scanner(System.in);
//		seatCount=input.nextInt();
		if (seatCount>=16) {
			setFee(1600);
		}else{
			setFee(800);
		}
		return super.rentFee(day);
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
}
