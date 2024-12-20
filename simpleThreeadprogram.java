import java.util.InputMismatchException;
import java.util.Scanner;
public class simpleThreeadprogram {
public static void main(String[] args) throws InterruptedException {
	iam t1=new iam();
	iam t2=new iam();
	iam t3=new iam();
	t1.setName("addition");
	t2.setName("printing");
	t3.setName("banking");
	t1.start();
	t2.start();
	t3.start();
}
}
class iam extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("addition")) {
			addition();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();
		}
		else {
			banking();
		}
		
	}
	void addition() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 1:addition oparation started");
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("result is: "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("not divisible by zero");
		}
		catch(InputMismatchException e1) {
			System.out.println("give correct input");
		}
	}
	void printing(){
		try {
		for(int i=0;i<5;i++) {
			System.out.println("L.Sreenivasulu");
			Thread.sleep(200);
		}
		}
		catch(InputMismatchException e1) {
			System.out.println("give correct input");
		}
		catch(InterruptedException e2) {
			System.out.println(e2);
		}
	}
	void banking() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 3:Banking oparation started");
		System.out.println("enter the account number");
	    int m=sc.nextInt();
		System.out.println("enter the pin code");
		int n=sc.nextInt();
		System.out.println("account details recorded");
		System.out.println("Task 3:banking oparation completed");
		}
		catch(InputMismatchException e1) {
			System.out.println("give correct input");
		}
	}
}