package secnd;

import java.util.Scanner;
public class shiyan2 {
	public static void main(String args[]) {// TODO Auto-generated method stub
		System.out.println("�˿����Ƽ�����");
		System.out.println("1���ӷ�");
		System.out.println("2������");
		System.out.println("3������");
		System.out.println("4���˷�");
		System.out.println("����ָ��");
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
		System.out.println("������ӵ�����");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	public static void sub() {
		System.out.println("�����������");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a-b;
		System.out.println(a+"-"+b+"="+c);
	}
	public static void div() {
		System.out.println("�������������");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	public static void mult() {
		System.out.println("������˵�����");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a*b;
		System.out.println(a+"*"+b+"="+c);
	}
}
