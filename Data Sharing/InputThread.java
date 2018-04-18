import java.io.*;
import java.net.*;

public class InputThread implements Runnable {
	private static final In in = new In();
	private final int A_LITTLE = 500;
	private String input;
	private DataQueue queue;
	
	public InputThread(DataQueue queue) {
		this.queue = queue;
	}
	
	public void run() {
		try {
			while (true) {
				EnumeratedString input = receiveInput();
				queue.put(input);
				if (input.toString() == null) break;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private EnumeratedString receiveInput() throws InterruptedException {
		Thread.sleep(A_LITTLE);
		System.out.println("Enter input string: "); 
		input = in.readLine();
		EnumeratedString es = new EnumeratedString(input);
		return es;
	}
}
