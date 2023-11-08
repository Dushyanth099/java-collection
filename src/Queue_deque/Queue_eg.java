package Queue_deque;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_eg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		//add element
		q.add("Rick");
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");
		System.out.println("Elements in Queue:" + q);
		System.out.println("Removed element :" + q.remove());
		//elelemet() method-this returns the head of the queue.head is the first elem of the queue
        System.out.println("Head:"+q.element());
        //poll()method-this removes and returns the head of he queue.returns null if te queue is empty
        System.out.println("poll():"+q.poll());
        //peek method_it works same as element() method, however it retuns null if queue uis emmpty
        System.out.println("peak():"+q.peek());
        //again dispaing htht elemens of the queue
        System.out.println("Elements in queue:"+q);
	}

}
