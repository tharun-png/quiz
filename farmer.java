package Tharun;

import java.util.Scanner;

public class farmer {
	double principle;
	static double rate;
	double time;
	double simpleinterest;
	static {
		rate=2.5;
	}
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount:");
		principle=sc.nextDouble();
		System.out.println("enter the time in years:");
		time=sc.nextDouble();
		
	}
	void calculate() {
		simpleinterest=(principle*time*rate)/100;
	}
	void Display() {
		System.out.println("simple interest is:"+simpleinterest);
	}
}
class Launch{
public static void main(String[] args) {
	farmer f=new farmer();
	f.collectData();
	f.calculate();
	f.Display();
		
	
}

}



