package chuzuche;

import java.util.Scanner;

public class Sys {
	public void rentMenu(){
		
		Scanner input=new Scanner(System.in);
//		private Car car=new Car();
//		private Trunk trunk=new Trunk();
//		String[]carType={"�������","����550i","aodi"};
		int []busType={16,32};
		System.out.println("-------------------------------");
		System.out.println("��ӭ�����ൺ��ѧ�⳵�����޹�˾��");
	    System.out.println("-------------------------------");	
		System.out.println("����������������");
		String name=input.next();
		System.out.println("��ѡ����Ҫ�⳵��������");
		int n=input.nextInt();
		for (int i = 0; i <n; i++) {			
	       System.out.println("��������Ҫ��ĵ�"+(i+1)+"�������ͣ�1.�γ�  2.�ͳ�����");
			int num=input.nextInt();
			if (num==1) {
				System.out.println("��ѡ�����:�γ�");
				System.out.println("��������Ҫ��ĳ����ͺţ�1.������� 2.����550i 3.���������):");
				num=input.nextInt();
				Car car=new Car();
				System.out.println("��ѡ�����:"+car.getName());
				System.out.println("��������Ҫ���������");
				int day=input.nextInt();
				car.rentFee(day);
				System.out.println("�۸��ǣ�"+car.getFee());

			}else if(num==2){
				System.out.println("��ѡ����ǿͳ���");
				System.out.println("����������Ҫ����λ��1.С��16/2.����16��");
				num=input.nextInt();
				Vehicle v=new Trunk(name);
				System.out.println("��ѡ�����:"+busType[num-1]+"��"); 
				System.out.println("�۸��ǣ�"+v.getFee());	
				System.out.println("��������Ҫ���������");
				int day=input.nextInt();
			}else{		
				System.out.println("�������");
			}
			
			
			System.out.println("����Ҫ֧�������Ϊ��"+"");
		}
		
	}
	
public static void main(String[] args) {
	Sys a=new Sys();
	a.rentMenu();
}
}
