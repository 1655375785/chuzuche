package chuzuche;

import java.util.Scanner;

public class Car extends Vehicle{
	Scanner input=new Scanner(System.in);
//	public Car(String Name){
//		super(Name);
//	}
	public void rentfee(int num){
		if (num==1) {
			setName("�������");
			setFee(600);
			return ;
		}else if(num==2){
			setName("����550i");
			setFee(500);
		}else if(num==3){
			setName("�µ�");
			setFee(300);
			}else{
				System.out.println("shurucuowu");
			}
		}
		

}
