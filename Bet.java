import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class iterator {
	public class Bet {
		public static void main(String[] args) {
			HashMap h=new HashMap();
			h.put(10,"reddy");
			h.put(20,"fan");
			h.put(60,"teddu");
			//System.out.println(h);
			Collection c=h.values();
			Iterator itr=c.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.hasNext());
			}
			Set s=h.keySet();
			Iterator itr2=c.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.hasNext());

		}

	}
	}
}
