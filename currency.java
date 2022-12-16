package CDT;

import java.util.Scanner;

public class currency {

	public void usdtoinr() {
		Scanner sc= new Scanner(System.in);
		int usd,inr;
		System.out.println("Enter Dollar:");
		usd=sc.nextInt();
		inr=usd*83;
		System.out.println("Indian Rupee:"+inr);
		
	}

	public void inrtousd() {
		Scanner sc= new Scanner(System.in);
		int inr;
		double usd;
		System.out.println("Enter Indian Rupee:");
		inr=sc.nextInt();
		usd=(double)inr/83;
		System.out.println("Indian Rupee:"+usd);
		
	}
	public void eurotoinr() {
		Scanner sc= new Scanner(System.in);
		int euro,inr;
		System.out.println("Enter euro:");
		euro=sc.nextInt();
		inr=euro*87;
		System.out.println("Indian Rupee:"+inr);
	}
	public void inrtoeuro() {
		Scanner sc= new Scanner(System.in);
		int euro,inr;
		System.out.println("Enter indian rupee:");
		inr=sc.nextInt();
		euro=inr/87;
		System.out.println("Indian Rupee:"+euro);
	}

	public void yentoinr() {
		Scanner sc= new Scanner(System.in);
		double yen,inr;
		
		System.out.println("Enter yen:");
		yen=sc.nextInt();
		inr= yen*0.61;
		System.out.println("Indian Rupee:"+inr);
		
	}

	public void inrtoyen() {
		Scanner sc= new Scanner(System.in);
		double yen,inr;
		System.out.println("Enter indian rupee:");
		inr=sc.nextInt();
		yen=inr/0.61;
		System.out.println("Yen:"+yen);
		
	}

}
