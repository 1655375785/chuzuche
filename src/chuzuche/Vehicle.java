package chuzuche;

import java.util.Scanner;

public abstract class Vehicle {
	private String Name;
	private int ZuMoney=0;
    Scanner input=new Scanner(System.in);
    public abstract void showName(int a);
    public void showMoney(int a){
    	
    }
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getZuMoney() {
		return ZuMoney;
	}
	public void setZuMoney(int zuMoney) {
		this.ZuMoney = zuMoney;
	}
}
