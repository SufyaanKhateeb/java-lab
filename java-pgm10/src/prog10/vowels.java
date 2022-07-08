package prog10;

import java.util.Scanner;

public class vowels extends Thread {
//	public void count() {
//		Scanner sc = new Scanner(System.in);
//		Integer c = 0;
//		System.out.println("Enter a string ");
//		String s = sc.next();
//		s = s.toLowerCase();
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'o'
//					|| s.charAt(i) == 'u')
//				c++;
//		}
//		System.out.println("vowels=" + c);
//	}
	public String string;
	public static String vowels = "aeiou";

	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		string = s.nextLine();
		int x = 0;
		for (char c : string.toCharArray())
			for (char ch : vowels.toCharArray())
				if (c == ch)
					x++;
		System.out.print(x + " vowels present\n");
	}
}
