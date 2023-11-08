package Queue_deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Iteator_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String>animals=new ArrayDeque<>();
animals.add("Dog");
animals.add("Cat");
animals.add("Cow");
animals.add("Horse");
animals.add("Hen");
animals.add("Tiger");
animals.add("Lion");
//using iterator
Iterator<String>iterate=animals.iterator();
while(iterate.hasNext()) {
System.out.print(iterate.next());
System.out.print(", ");
}
System.out.println("\nArrayDeque in reverse Order: ");
//usind decendingIterator()
Iterator<String>deIterate=animals.descendingIterator();
while(deIterate.hasNext()) {
System.out.print(deIterate.next());
System.out.print(", ");
}
	}
}
