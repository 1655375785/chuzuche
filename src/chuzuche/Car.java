package chuzuche;

import java.util.Scanner;

public class Car extends Vehicle{
	Scanner input=new Scanner(System.in);
//	public Car(String Name){
//		super(Name);
//	}
	public void rentfee(int num){
		if (num==1) {
			setName("别克商务");
			setFee(600);
			return ;
		}else if(num==2){
			setName("宝马550i");
			setFee(500);
		}else if(num==3){
			setName("奥迪");
			setFee(300);
			}else{
				System.out.println("shurucuowu");
			}
		}
		

}
