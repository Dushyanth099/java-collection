package Queue_deque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[]A= {1,2,3,4,5};
Integer[]B= {5,3,6,7,9};
Set<Integer>set1=new HashSet<Integer>();
set1.addAll(Arrays.asList(A));
Set<Integer>set2=new HashSet<Integer>();
set2.addAll(Arrays.asList(B));
Set<Integer>union_data=new HashSet<Integer>(set1);
union_data.addAll(set2);
System.out.println("Union of set and set2 is:");
System.out.println(union_data);
Set<Integer>intersection_data=new HashSet<Integer>(set1);
intersection_data.retainAll(set2);
System.out.println("Intersection of set and set2 is:");
System.out.println(intersection_data);
//finding difference
Set<Integer>difference_data=new HashSet<Integer>(set1);
difference_data.removeAll(set2);
System.out.println("Difference of set and set2 is:");
System.out.println(difference_data);
}
}