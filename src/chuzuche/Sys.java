package chuzuche;

import java.util.Scanner;

public class Sys {
	public void rentMenu(){
		
		Scanner input=new Scanner(System.in);
//		private Car car=new Car();
//		private Trunk trunk=new Trunk();
		String[]carType={"别克商务","宝马550i","aodi"};
		int []busType={16,32};
		System.out.println("-------------------------------");
		System.out.println("欢迎来到青岛大学租车社有限公司！");
	    System.out.println("-------------------------------");	
		System.out.println("请输入您的姓名：");
		String name=input.next();
		System.out.println("请选择您要租车的数量：");
		int n=input.nextInt();
		
		for (int i = 0; i <n; i++) {			
	       System.out.println("请输入您要租的第"+(i+1)+"辆车车型（1.轿车  2.客车）：");
			int num=input.nextInt();
			if (num==1) {
				System.out.println("您选择的是:轿车");
				System.out.println("请输入您要租的车的型号（1.别克商务 2.宝马550i 3.别克林荫大道):");
				int num1=input.nextInt();
				Vehicle v=new Car("88888");
				System.out.println("您选择的是:"+carType[num1-1]);
				System.out.println("请输入您要租的天数：");
				int day=input.nextInt();		
				System.out.println("价格是："+v.rentFee(day));
			}else if(num==2){
				System.out.println("您选择的是客车。");
				System.out.println("请输入您需要的座位数1.小于16/2.大于16：");
				num=input.nextInt();
				Vehicle v=new Trunk(name);
				System.out.println("您选择的是:"+busType[num-1]+"座");
				System.out.println("请输入您要租的天数：");
				int day=input.nextInt();
				System.out.println("价格是："+v.rentFee(day));	
			}else{		
				System.out.println("输入错误！");
			}
			
			
			System.out.println("您需要支付的租金为："+"");
		}
		
	}
	
public static void main(String[] args) {
	Sys a=new Sys();
	a.rentMenu();
}
}
