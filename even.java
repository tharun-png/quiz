import java.util.InputMismatchException;
class a extends Thread{
	public void run() {
		try {
			for(int i=1;i<=10;i++){
				System.out.println(i);
		
			if(i%2==1){
				System.out.println("odd numbers:"+i);
			}
			else {
				System.out.println("even numbers:"+i);
			}
	}
}
catch(ArithmeticException e){
	System.out.println("ArithmeticException ");
	}
}
}
public class even {
	 public static void main(String[] args) throws InterruptedException {
		 a e1=new a();
		 e1.start();
	 }
}


