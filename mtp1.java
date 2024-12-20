import java.util.InputMismatchException;
import java.util.Scanner;

	
	class iam implements Runnable{
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
				System.out.println("P Tharun");
				Thread.sleep(2000);
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
public class mtp1 {
	public static void main(String[] args) throws InterruptedException {
				iam t1=new iam();
				iam t2=new iam();
				iam t3=new iam();
				Thread t=new Thread(t1);
				Thread t11=new Thread(t2);
				Thread t22=new Thread(t3);
				t.setName("addition");
				t11.setName("printing");
				t22.setName("banking");
				t.start();
				t11.start();
				t22.start();
	}
}
	



