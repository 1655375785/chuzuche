package chuzuche;

import java.util.Scanner;

public class Car extends Vehicle{
	private String [] type={"�������","����550i","�µ�"};
	Scanner input=new Scanner(System.in);
//	private int fee;
	public Car(String motoNo,String typ){
		super(motoNo);
		this.type=type;
	}

	public double rentFee(int day){
		if (type.equals("�������" )) {
			setFee(600);
		
		}else if(type.equals("����550i")){
			
			setFee(500);
		}else {
			
			setFee(300);
			}
		return super.rentFee(day);
		}

	public String[] getType() {
		return type;
	}

	public void setType(String[] type) {
		this.type = type;
	}


}
