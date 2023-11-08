package Colllection;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
public class Eg_4{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// List
		@SuppressWarnings("rawtypes")
		ArrayList numbers =new ArrayList<>();
		numbers.add(1);
		numbers.add(7);
		numbers.add(5);
		numbers.add(6);
		numbers.add("&**7");
		numbers.add("File2");
	System.out.println("no of elements in array list:"+numbers.size());
	}
}