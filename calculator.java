package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int n1,n2,res = 0;
		char op;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Enter operator + - * / %:");
		op=sc.next().charAt(0);
		switch(op) {
		
		case '+':
			res=n1+n2;
			//System.out.println("Result="+res);
			break;
		case '-':
			res=n1-n2;
			//System.out.println("Result="+res);
			break;
		case '*':
			res=n1*n2;
			//System.out.println("Result="+res);
			break;
		case '/':
			res=n1/n2;
			//System.out.println("Result="+res);
			break;
		case '%':
			res=n1%n2;
			//System.out.println("Result="+res);
			break;
			default:
				System.out.println("INVALID OPERATOR");
				break;
				
		}
		
		System.out.println(res);
		
	}

}
