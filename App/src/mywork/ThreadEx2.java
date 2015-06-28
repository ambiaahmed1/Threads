package mywork;

class A implements Runnable {

	public static int count = 0;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(A.count <=10) {
			
			try {
				System.out.println("Expl Thread: " + (++A.count));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

public class ThreadEx2 {
		
	public static void main(String[] args) {
		
	System.out.println("Starting main thread...");
	A mrt = new A();
	Thread t = new Thread(mrt);
	t.start();
	
	while(A.count <=10) {
		
		System.out.println("Main Thread: " + (++A.count));
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("End of main thread...");
	}

}
