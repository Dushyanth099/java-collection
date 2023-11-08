package Queue_deque;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class T_reemap {
//this is how to declare tree map
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String>tmap=new TreeMap<Integer,String>();
//adding elements to treemap
tmap.put(1,"Data1");
tmap.put(23,"Data2");
tmap.put(70,"Data3");
tmap.put(4,"Data4");
tmap.put(2,"Data5");
//display contents using iterator
Set set=tmap.entrySet();
Iterator iterator=set.iterator();
while(iterator.hasNext()) {
	Map.Entry mentry=(Map.Entry)iterator.next();
	System.out.print("key is:"+mentry.getKey()+ "&  Value is");
	System.out.println(mentry.getValue());
}
}
}
