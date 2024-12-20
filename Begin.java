class oddeven implements Runnable{
	static int count=1; Object obj=new Object();
	public void run() {
		try {
			while(count<10) { 
				if(count%2==0 && Thread.currentThread().getName().equals("Even")) { 
					synchronized(obj) { 
						System.out.println("Thread name: "+Thread.currentThread().getName()+" Value: "+count);
						Thread.sleep(2000);
						obj.wait();
					}
				}
				if(count%21==0 && Thread.currentThread().getName().equals("Odd")){
				synchronized(obj) {
				System.out.println("Thread name: "+Thread.currentThread().getName()+" Value: "+count);
				Thread.sleep(2000);
				}
				}
					
				count++;
				obj.notify();
					
				}
		}
	catch(InterruptedException e){
		System.out.println(e);
		}
}
class Begin{
	public static void main(String[] args) throws IllegalMonitorStateException{
		oddeven eo=new oddeven();
		oddeven eo2=new oddeven();
		Thread t1=new Thread(eo);
		Thread t2=new Thread(eo2);
		t1.setName("Even"); 
		t2.setName("Odd");
		t1.start(); 
		t2.start();
	}
}
}


	
