package chuzuche;

import java.util.Scanner;

public class Sys {
	Scanner input=new Scanner(System.in);
	private Car car=new Car();
	private Trunk trunk=new Trunk();
	private Person person=new Person();
	int days,money;
	public void showMenu(){
		System.out.println("\t��ӭ�����ൺ��ѧ�⳵�����޹�˾��");
		System.out.println("���⳵��˾�ṩ���³������޷���"+"�γ���"+
		car.getName());
		
		
		
	}
	public void askRentname(){
		System.out.println("����������������");
		person.inputName();
		
	}
	public void askChoice(){
		System.out.println("��������Ҫ��ĳ��ͣ�1.�γ�  2.�ͳ�����");
		int num=input.nextInt();
		
			
			if (num==1) {
				System.out.println("��ѡ�����:�γ�");
				System.out.println("��������Ҫ��ĳ����ͺţ�1.������� 2.����550i 3.���������):");
				int c=person.inputChoice();
				car.showName( c);
				car.showMoney(c);
				System.out.println("��ѡ�����:"+car.getName());
				money=car.getZuMoney();
				System.out.println("�۸��ǣ�"+money);
			
			}else if(num==2){
				System.out.println("��ѡ����ǿͳ���");
				System.out.println("����������Ҫ����λ��1.С��16/2.����16��");
				int c=person.inputChoice();
				trunk.showName(c);
				trunk.showMoney(c);;
				System.out.println("��ѡ�����:"+trunk.getName());
				money=trunk.getZuMoney();
				System.out.println("�۸��ǣ�"+money);	
			}else{		
				System.out.println("�������");
			}
		
	}
	public void rentTime(){
		System.out.println("��������Ҫ���������");
	    days=person.inputTime(days);	
	}
	public void totalMoney(){
		System.out.println("����Ҫ֧�������Ϊ��"+money*days);
	}
	
public static void main(String[] args) {
	Sys a=new Sys();
	a.showMenu();
	a.askRentname();
	a.askChoice();
	a.rentTime();
	a.totalMoney();
}
}
