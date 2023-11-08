package Queue_deque;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the no of elements");
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	s.close();
}

	}

}
