package day1;
import java.util.Scanner;
public class FirstTestCase {

	public static void main(String[] args) {
		//int num=16;
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter number for multiplication");
		int num=sc.nextInt();		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
