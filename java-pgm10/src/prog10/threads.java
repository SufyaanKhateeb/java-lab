package prog10;

public class threads {
//	public static void main(String[] args) throws InterruptedException {
//		number1 a = new number1();
//		vowels b = new vowels();
//		a.words();
//		Thread.sleep(10000);
//		b.count();
//	}

	public static void main(String[] args) throws InterruptedException {
		vowels vowel;
		number1 number;
		number = new number1();
		vowel = new vowels();
		// getNumberThread.start();
		vowel.start();
		Thread.sleep(5000);
		// getStringThread.start();
		number.start();
	}
}
