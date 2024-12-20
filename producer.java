class queue{
int data;
public void put(int i){
data=i;
System.out.println("Data Added... The data value is: "+1);
}
public void get(){
System.out.println("Data retrived... The data value is: "+data);
}
}
class Producer extends Thread{
Queue a;
public Producer (Queue q){
@Override 
public void run()
