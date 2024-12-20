package Tharun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MSoffice extends Thread{
		public void typing(){
			try {
				for(int i=0;i<5;i++) {
					System.out.println("typing");
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
		public void spellcheck(){
			try {
				for(int i=0;i<5;i++) {
					System.out.println("spellcheck");
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
		public void saving(){
			try {
				for(int i=0;i<5;i++) {
					System.out.println("saving");
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
		public void run()
		{
			if(Thread.currentThread().getName().equals("typing")) {
				typing();
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();
		}
		else  {
			saving();
		}
		}
	}
class test{
	public static void main(String[] args) throws InterruptedException{
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		t1.setName("typing");
		t2.setName("spellcheck");
		t3.setName("saving");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	}
}
	
		

