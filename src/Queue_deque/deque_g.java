package Queue_deque;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;

public class deque_g {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
Deque<String>dq=new ArrayDeque<String>();
	dq.add("One");
	dq.add("two");
	dq.add("three");
	dq.add("four");
	dq.add("five");
	System.out.println("Elements in deque:"+dq);
	dq.addFirst("red");
	dq.addLast("blue");
	System.out.println("Elements in deque:"+dq);
	System.out.println("peek() :"+dq.peek());
	dq.remove("red");
	dq.remove("blue");
	System.out.println("Elements in deque:"+dq);
	dq.remove("three");
	System.out.println("Elements in deque:"+dq);
	System.out.println("ArrayDeque in reverse Order: ");
	Iterator<String>deIterate=dq.descendingIterator();
	while(deIterate.hasNext()) {
	System.out.print(deIterate.next());
	System.out.print(", ");
	}
		}
	}
