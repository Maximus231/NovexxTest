package threadsApp0;

class Thread1 implements Runnable {
	private Thread thr; //link to the thread's object	  
	
	public Thread1() { 
		thr = new Thread(this, "Thread1."); //create thread
		thr.start();						//start thread
	}
	
	public void run() { //override of thread's exec method 
		while (true) {	
			try {
				this.thr.currentThread().sleep(1111);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Math.random());
		}
	}
	public Thread getThread() { return thr; } //method to get the link to thread's object
}

public class EnterPointForConsoleOut {
	public static void main(String[] args) {		 
		Thread1 t1 = new Thread1();
		try {
			t1.getThread().join(); // wait while thread ends his job
		}
		catch (InterruptedException e) {
			System.out.println("Error.");
		}
	}
}


