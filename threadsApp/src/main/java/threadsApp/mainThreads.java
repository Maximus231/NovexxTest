package threadsApp;
//import java.util.*;
class Thread1 implements Runnable {
	private Thread thr; //link to the thread's object
	private int lengthOfFibo; 
	private int result; 
 
	public Thread1(int lengthOfFibo_) { //thread constructor
		lengthOfFibo = lengthOfFibo_;
		thr = new Thread(this, "Thread1."); //create thread
		thr.start();						//start thread
	}
	  
	public void run() { //override of thread's exec method 
		int previous = 0;
		int current = 1;
		int next = 0;
		for (int i=2; i<lengthOfFibo; i++) {
			next = previous + current;
			previous = current;
			current = next;
		}
		result = next;
	}

	public Thread getThread() { return thr; } //method to get the link to thread's object
	public int getResult() { return result; } //method to get a result from child thread
	}

public class mainThreads {
	public static void main(String[] args) {
		int cLengthOfFibo = 30; 
			Thread1 t1 = new Thread1(cLengthOfFibo);
			try {
				t1.getThread().join(); // wait while thread ends his job
			}
			catch (InterruptedException e) {
				System.out.println("Error.");
			}
			System.out.println(cLengthOfFibo+"th term of the fibonacci sequence is " + t1.getResult());
	}
}
