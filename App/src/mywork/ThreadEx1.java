package mywork;

public class ThreadEx1 extends Thread{

	public void run() {
		
		System.out.println("Thread Started.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		ThreadEx1 t1 = new ThreadEx1();
		t1.start();
		
		ThreadEx1 t2 = new ThreadEx1();
		t2.start();
	}
	
	
	
}
