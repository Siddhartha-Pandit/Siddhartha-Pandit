package CDT;

import java.util.Scanner;

public class time {

	public void sectomin() {
		Scanner sc= new Scanner(System.in);
		double sec,min;
		System.out.println("Enter Time in second:");
		sec=sc.nextInt();
		min=sec/60;
		System.out.println(sec+"sec:"+min+"min");
		
	}

	public void mintosec() {
		Scanner sc= new Scanner(System.in);
		double sec,min;
		System.out.println("Enter Time in minutes:");
		min=sc.nextInt();
		sec=min*60;
		System.out.println(min+"min:"+sec+"min");	
	}

	public void sectohrs() {
		Scanner sc= new Scanner(System.in);
		double sec,hrs;
		System.out.println("Enter Time in second:");
		sec=sc.nextInt();
		hrs=sec/(60*60);
		System.out.println(sec+"sec:"+hrs+"hrs");
		
	}

	public void mintohrs() {
		Scanner sc= new Scanner(System.in);
		double min,hrs;
		System.out.println("Enter Time in minutes:");
		hrs=sc.nextInt();
		min=hrs*60;
		System.out.println(hrs+"hrs:"+min+"min");			
	}

	public void hrstosec() {
		Scanner sc= new Scanner(System.in);
		double sec,hrs;
		System.out.println("Enter Time in hour:");
		hrs=sc.nextInt();
		sec=hrs*60*60;
		System.out.println(hrs+"hrs:"+sec+"sec");		
		
	}

	public void hrstomin() {
		Scanner sc= new Scanner(System.in);
		double min,hrs;
		System.out.println("Enter Time in hour:");
		min=sc.nextInt();
		hrs=min*60;
		System.out.println(min+"min:"+hrs+"hrs");
				
	}

}
