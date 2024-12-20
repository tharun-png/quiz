package Tharun;
import java.util.*;
public class sam {
		public static void main(String[] args){
			ArrayList all=new ArrayList();
			all.add(30);
			all.add(20);
			System.out.println(all);
			ArrayList al2=new ArrayList();
			al2.add("Akash");
			al2.add(49);
			System.out.println(al2);
			ArrayList al3=new ArrayList();
			al3.add(al2);//can add a complete arraylist
			al3.add(55);//added to rear
			al3.add(0,7);
			al3.add(1,9);
			System.out.println(al3);

	}
	}

