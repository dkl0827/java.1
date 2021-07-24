package secnd;

import java.io.IOException;
import java.util.Scanner;
class opreation{
	int a,b,c;
	void add() {
		
	}
	void mul() {
		
	}
	void sub() {
		
	}
	void div() {
		
	}
}
class add extends opreation{
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
}
class mul extends opreation{
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println(a+"*"+b+"="+c);
	}
}

class sub extends opreation{
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println(a+"-"+b+"="+c);
	}
}

class div extends opreation{
	public void div(int a,int b) {
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
}

public class shiyan2 {
	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		opreation op1 = new opreation();
		opreation op2 = new opreation();
		Scanner s=new Scanner(System.in);
		System.out.println("输入第一个数");
		op1.a=s.nextInt();
		System.out.println("输入运算符");
		char ch = (char) System.in.read();
		System.out.println("输入第二个数");
		op2.b=s.nextInt();
		char m=ch;
		switch(m) {
		case '+':
			add ad=new add();
			ad.add(op1.a,op2.b);
			break;
		case '*':
			mul mu=new mul();
			mu.mul(op1.a,op2.b);
			break;
		case '-':
			sub su = new sub();
			su.sub(op1.a, op2.b);
			break;
		case '/':
			div di = new div();
			di.div(op1.a, op2.b);
			break;
			
		}
		
	}
}

