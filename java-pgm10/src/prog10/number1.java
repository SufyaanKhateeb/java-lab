package prog10;

import java.util.*;

public class number1 extends Thread {
//	public void words() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a 4d no ");
//		String num=sc.next();
//		String[] s=new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
//		
//		for(char c:num.toCharArray()) {
//			if(c>'9' || c<'0') {
//				System.out.println("Invalid");
//				return;
//			}
//			System.out.println(s[c-'0']+"\n");
//		}
//		return;
//	}

	public String number;
	private static String[] digit = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven",
			"eight", "nine" };

	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number with more than 4 digits: ");
		number = s.next();
		for (char c : number.toCharArray()) {
			if (c < 48 || c > 57) {
				System.out.println("Invalid inputs");
				break;
			}
			System.out.print(digit[((int) c - 48)] + " ");
		}
		System.out.print("\n");
	}
}
