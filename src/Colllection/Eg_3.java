package Colllection;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
public class Eg_3{
	public static void main(String[] args) {
		// List
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("HCL");
		alist.add("DELL");
		alist.add("CTS");
		alist.add("TCS");
		alist.add("Tech mah");
	System.out.println(alist);//dispay elements
	alist.remove("DELL");	//remove
	alist.remove("CTS");    //remove
	System.out.println(alist);
	alist.remove(2);
	System.out.println(alist);///iteration array means using "for each loop or for loop".
	for(String str:alist)
		System.out.println(str);
	System.out.println("no of elements in array list:"+alist.size());
	}
}