import java.io.*;
import java.net.*;

public class InputThread implements Runnable {
	private String line;
	final int aLittle = 500;
	
	public InputThread(String read) {
		this.line = read;
	}
	
	public void run() {
		System.out.println("Entering thread...");
		try {
			System.out.println(line);
			Thread.sleep(aLittle);
		} catch (InterruptedException ie) {
			System.out.println(ie);
		}
		System.out.println("Exiting thread...");
	}
}
