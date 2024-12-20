class Warrior extends Thread{
String res1="Ak47";
String res2="M416";
String res3="АwМ";
@Override
public void run(){
if(Thread.currentThread().getName().equals("Student1"))
{
Student1Acq();
}
else
{
Student2Acq();
}
}
public void Student1Acq(){
try{
synchronized(res1) {
System.out.println("Student1 Acquired the resource: "+res1);
Thread.sleep(3000);
synchronized(res2){
System.out.println("Student1 Acquired the resource: "+res2);
Thread.sleep(3000);
synchronized(res3){
System.out.println("Studenti Acquired the resource: "+res3);
Thread.sleep(3000);
}//Release of resource:3
}//Release of resource:2
}//Release of resource:1
} 
catch (InterruptedException e){
e.printStackTrace();
}
}
public void Student2Acq(){
try{
synchronized(res1){
System.out.println("Student1 Acquired the resource: "+res1);
Thread.sleep(3000);
synchronized(res2) {
System.out.println("Student1 Acquired the resource: "+res2); 
Thread.sleep(3000); 
synchronized(res3){
System.out.println("Student1 Acquired the resource: "+res3);
Thread.sleep(3000);
}
}
}
}
catch (InterruptedException e){
e.printStackTrace();
}
}
}
class sync{
	public static void main(String[] args){
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();
		w1.setName("student1");
		w2.setName("student2");
		w1.start();
		w2.start();
	}
}
