package secnd;

import java.util.Scanner;
public class shiyan2 {
	public static void main(String args[]) {// TODO Auto-generated method stub
		System.out.println("邓凯临牌计算器");
		System.out.println("1：加法");
		System.out.println("2：减法");
		System.out.println("3：除法");
		System.out.println("4：乘法");
		System.out.println("输入指令");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(x);
		switch(x){
			case 1:{
				add();
				break;
			}
			case 2:{
				sub();
				break;
			}
			case 3:{
				div();
				break;
			}
			case 4:{
				mult();
				break;
			}
		}
	}

	public static void add() {
		System.out.println("输入相加的数据");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	public static void sub() {
		System.out.println("输入相减数据");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a-b;
		System.out.println(a+"-"+b+"="+c);
	}
	public static void div() {
		System.out.println("输入相除的数据");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	public static void mult() {
		System.out.println("输入相乘的数据");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a*b;
		System.out.println(a+"*"+b+"="+c);
	}
}
