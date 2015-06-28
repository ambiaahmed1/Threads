package mywork;

class PrintChar implements Runnable {

	private char charToPrint;
	private int num;
	
	PrintChar(char c, int num) {

		this.charToPrint = c;
		this.num = num;
		
	}

	@Override
	public void run() {
		for (int i = 0; i < num; i++) {

			System.out.print(charToPrint);
		}

	}

}

class PrintNum implements Runnable {
	
		private int num;

		PrintNum(int num) {
			this.num = num;
		}
		
		@Override
		public void run() {
			for(int i =1; i<=num; i++) {
				
				System.out.print(" " +i);
			}
			
		}
	
	
}

public class ThreadEx3 {
	public static void main(String[] args) {
		
			Runnable printA = new PrintChar('a', 100);
			Runnable printB = new PrintChar('b', 100);
			Runnable print100 = new PrintNum(100);
			
			Thread t1 = new Thread(printA);
			Thread t2 = new Thread(printB);
			Thread t3 = new Thread(print100);
			
			t1.start();
			t2.start();
			t3.start();
	}
}
