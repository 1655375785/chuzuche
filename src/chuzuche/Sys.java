package chuzuche;

import java.util.Scanner;

public class Sys {
	Scanner input=new Scanner(System.in);
	private Car car=new Car();
	private Trunk trunk=new Trunk();
	private Person person=new Person();
	int days,money;
	public void showMenu(){
		System.out.println("\t欢迎来到青岛大学租车社有限公司！");
		System.out.println("本租车公司提供以下车型租赁服务："+"轿车："+
		car.getName());
		
		
		
	}
	public void askRentname(){
		System.out.println("请输入您的姓名：");
		person.inputName();
		
	}
	public void askChoice(){
		System.out.println("请输入您要租的车型（1.轿车  2.客车）：");
		int num=input.nextInt();
		
			
			if (num==1) {
				System.out.println("您选择的是:轿车");
				System.out.println("请输入您要租的车的型号（1.别克商务 2.宝马550i 3.别克林荫大道):");
				int c=person.inputChoice();
				car.showName( c);
				car.showMoney(c);
				System.out.println("您选择的是:"+car.getName());
				money=car.getZuMoney();
				System.out.println("价格是："+money);
			
			}else if(num==2){
				System.out.println("您选择的是客车。");
				System.out.println("请输入您需要的座位数1.小于16/2.大于16：");
				int c=person.inputChoice();
				trunk.showName(c);
				trunk.showMoney(c);;
				System.out.println("您选择的是:"+trunk.getName());
				money=trunk.getZuMoney();
				System.out.println("价格是："+money);	
			}else{		
				System.out.println("输入错误！");
			}
		
	}
	public void rentTime(){
		System.out.println("请输入您要租的天数：");
	    days=person.inputTime(days);	
	}
	public void totalMoney(){
		System.out.println("您需要支付的租金为："+money*days);
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
