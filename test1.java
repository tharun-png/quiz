 class Human extends Thread{

@Override

public void run(){

try{

	System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
	
	Thread.sleep(3000); System.out.println(Thread.currentThread().getName()+" is using the bathroom");
	
	Thread.sleep(3000);
	
	System.out.println(Thread.currentThread().getName()+" is finished using the bathroom");
	
	Thread.sleep(3000);

	} 
	catch (InterruptedException e)
	
	{
	
		e.printStackTrace();

}

}

}
public class test1{
	public static void main(String[] args) throws InterruptedException{
		Human b=new Human();
		Human g=new Human();
		Human o=new Human();
		b.setName("boy");
		g.setName("girl");
		o.setName("others");
		b.start();
		b.join();
		g.start();
		g.join();
		o.start();
		o.join();
	}
}