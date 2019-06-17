
package map;
import java.util.*;
import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
	

		HashMap<Integer,String> map=new HashMap<Integer,String>();
		 map.put(15,"sree");
		 map.put(14, "sana");
		 map.put(13, "naveen");
		 map.put(12,"swapna");
		 map.put(11,"ranga");
		 Iterator trav=map.entrySet().iterator();
		 while(trav.hasNext())
		 {
			 HashMap.Entry record=(HashMap.Entry)trav.next();
					 System.out.println(record.getKey()+"->"+record.getValue());
;
			 }
		 
		 
		 
	}
}
