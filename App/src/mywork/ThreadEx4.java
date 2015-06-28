package mywork;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class ThreadEx4 extends JApplet implements Runnable {

	private JLabel jlbltext = new JLabel("Welcome ",JLabel.CENTER);
	
	
	public ThreadEx4() {
		add(jlbltext);
		new Thread(this).start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		while(true) {
			
			if(jlbltext.getText() ==null)
				jlbltext.setText("Welcome");
			else
				jlbltext.setText(null);
			
		
				Thread.sleep(200);
			}
		} 
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
