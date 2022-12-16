package CDT;

import java.util.Scanner;

public class distance {

	public void mtokm() {
		Scanner sc= new Scanner(System.in);
		double m,km;
		System.out.println("Enter Distance in meter:");
		m=sc.nextInt();
		km=m/1000;
		System.out.println(m+"m:"+km+"km");		
	}

	public void kmtom() {
		Scanner sc= new Scanner(System.in);
		double m,km;
		System.out.println("Enter Distance in Kilometer:");
		km=sc.nextInt();
		m=km*1000;
		System.out.println(km+"km:"+m+"m");				
	}

	public void kmtomiles() {
		Scanner sc= new Scanner(System.in);
		double miles,km;
		System.out.println("Enter Distance in kilometer:");
		km=sc.nextInt();
		miles=km/1.6092;
		System.out.println(km+"km:"+miles+"miles");	
		
	}

	public void milestokm() {
		Scanner sc= new Scanner(System.in);
		double miles,km;
		System.out.println("Enter Distance in miles:");
		miles=sc.nextInt();
		km=miles*1.6092;
		System.out.println(miles+"miles:"+km+"KM");	
		
	}

}
