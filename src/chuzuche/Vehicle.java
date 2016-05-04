package chuzuche;

import java.util.Scanner;

public abstract class Vehicle {
	private String Name;
	private int fee; 
//	public Vehicle(String Name){
//		this.Name=Name;
//	}
	public abstract void rentfee(int num);
    public int rentFee(int day){
    	return fee*day;
    }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}


}
