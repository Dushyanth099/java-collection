package Queue_deque;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
Deque<String>dq=new ArrayDeque<String>();
	dq.add("glenn");
	dq.add("Negan");
	dq.addLast("maggie");
	dq.addFirst("rck");
	dq.add("daryl");
	System.out.println("Elements in deque:"+dq);
	System.out.println("Elements in remove last:"+dq.removeLast());
	System.out.println("Head:"+dq.element());
	System.out.println("poll() :"+dq.pollLast());
	System.out.println("peek() :"+dq.peek());
	System.out.println("elements in deque :"+dq);
	}
}
	