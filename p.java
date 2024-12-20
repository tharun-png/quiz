interface g{
void col();
void cal();
void dis();
}
interface s extends g{
}
class a implements s{
double pi=3.14;
double r=5,area;
}
public void cal(){
area=pi*r*r;
}
public void dis(){
System.out.println("area of circle is:"+area);
}
class b implements s{
double a=6,area1;
}
public void cal(){
area1=a*a;
}
public void dis(){
System.out.println("area of square is:"+area1);
}
class c implements s{
double l=3,b=4,area2;
}
public void cal(){
area2=l*b;
}
public void dis(){
System.out.println("area of rectangle is:"+area2);
}
class p{
public static void main(String[] args){
a o=new a();
o.cal();
o.dis();

b q=new b();
q.cal();
q.dis();

c w=new c();
w.cal();
w.dis();

}
}

