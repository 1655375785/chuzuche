package chuzuche;

import java.util.Scanner;

import javax.management.relation.RelationNotFoundException;

public class Sys {
	Vehicle []veh;
	public void rentMenu(){		
		Scanner input=new Scanner(System.in);
		String[]carType={"�������","����550i","aodi"};
		String []busType={">16","<16"};
		System.out.println("-------------------------------");
		System.out.println("  ��ӭ�����ൺ��ѧ�⳵���޹�˾��");
	    System.out.println("-------------------------------");		
		System.out.println("��������Ҫ���������");
		int day=input.nextInt();
		System.out.println("��ѡ����Ҫ�⳵��������");
		int n=input.nextInt();
	    veh=new Vehicle[n];
		for (int i = 0; i <n; i++) {			
	       System.out.println("��������Ҫ��ĵ�"+(i+1)+"�������ͣ�1.�γ�  2.�ͳ�����");
			int num=input.nextInt();
			if (num==1) {
				System.out.println("��ѡ�����:�γ�");
				System.out.println("��������Ҫ��ĳ����ͺţ�1.������� 2.����550i 3.���������):");
				int num1=input.nextInt();
				veh[i]=new Car("88888",carType[num1-1]);
//				Car car=new Car();
//				car.setType(carType);
				System.out.println("��ѡ�����:"+carType[num1-1]);		
				//System.out.println("�۸��ǣ�"+v.rentFee(day));
				//totalfee[i]=v.rentFee(day);
			}else if(num==2){
				System.out.println("��ѡ����ǿͳ���");
				System.out.println("����������Ҫ����λ��1.С��16/2.����16��");
				num=input.nextInt();
				veh[i]=new Trunk("8888",busType[num-1]);
				System.out.println("��ѡ�����:"+busType[num-1]+"��");				
				//System.out.println("�۸��ǣ�"+v.rentFee(day));
				//totalfee[i]=v.rentFee(day);
			}else{		
				System.out.println("�������");
			}
			
		}
		double totalfee=0;
		for (int i = 0; i < veh.length; i++) {
			double fee=veh[i].rentFee(day);
			totalfee=totalfee+fee;
			System.out.println("car  "+day+"  "+fee);
//			if (veh[i] instanceof Car) {
//				System.out.println("car  "+day+"  "+fee);
//			}else
//				System.out.println("bus  "+day+"  "+fee);
			
		}	
		System.out.println("��һ����Ҫ֧�������Ϊ��"+totalfee);
		//calFee(day);
	}
	public void calFee(int day){
	}
	
public static void main(String[] args) {
	Sys a=new Sys();
	a.rentMenu();
	a.calFee(0);
}
}
