package chuzuche;

import java.util.Scanner;

public abstract class Vehicle {
	private String motoNo;
	private double fee; 
	public Vehicle(String motoNo){
		this.motoNo=motoNo;
	}
    public double rentFee(int day){ 
    		return day * fee; 
    	 	} 


	public String getMotoNo() {
		return motoNo;
	}

	public void setMotoNo(String motoNo) {
		this.motoNo = motoNo;
	}

	public double getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
		
	}


}
