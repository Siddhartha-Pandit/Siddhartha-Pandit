package convertor;

import java.util.Scanner;

import CDT.*;


public class convertor {
	public static void main(String[] args) {
		int x,choice;
		currency c=new currency();
		time t= new time();
		distance d=new distance();
		do {
				Scanner sc = new Scanner(System.in);
				System.out.println("CURRENCY TIME AND DISTANCE CONVERTER");
				System.out.println("1. USD to INR");
				System.out.println("2. INR to USD");
				System.out.println("3. Euro to inr");
				System.out.println("4. Inr to Euro");
				System.out.println("5. YEN to INR");
				System.out.println("6. INR to YEN");
				System.out.println("7. SEC to MIN");
				System.out.println("8. SEC to HRS");
				System.out.println("9. MIN to SEC");
				System.out.println("10. MIN to HRS");
				System.out.println("11. HRS to SEC");
				System.out.println("12. HRS to MIN");
				System.out.println("13. Meter to KM");
				System.out.println("14. KM to Meter");
				System.out.println("15. KM to MILE");
				System.out.println("16. MILE to KM");
				System.out.println("Enter Your Choice");
				choice=sc.nextInt();
				switch(choice) {
					case 1:
						
						c.usdtoinr();
						break;
					case 2:
						c.inrtousd();
						break;
					case 3:
						c.eurotoinr();
						break;
					case 4:
						c.inrtoeuro();
						break;
					case 5:
						c.yentoinr();
						break;
					case 6:
						c.inrtoyen();
						break;
					case 7:
						t.sectomin();
						break;
					case 8:
						t.sectohrs();
						break;
					case 9:
						t.mintosec();
						break;
					case 10:
						t.mintohrs();
						break;
					case 11:
						t.hrstosec();
						break;
					case 12:
						t.hrstomin();
						break;
					case 13:
						d.mtokm();
						break;
					case 14:
						d.kmtom();
						break;
					case 15:
						d.kmtomiles();
						break;
					case 16:
						d.milestokm();
						break;
						
					
				}
				System.out.println("Press 1 if u want to continue or press 0 to exit program");
				x=sc.nextInt();
			
		}while(x==1);
		
	}

	private static void milestokm() {
		// TODO Auto-generated method stub
		
	}

}
