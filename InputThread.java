import java.io.*;
import java.net.*;

public class InputThread implements Runnable {
	DataInputStream in;
	private boolean checkLoop = false;


	public void run() {
		In into = new In();
		String read;
		System.out.println("Entered thread...");
		while(!checkLoop)
		{
			try
			{
				System.out.println("running1");
				read = into.readLine();
				System.out.println(read);
				if(read.equals("bye"))
				{
					checkLoop = true;
				}
				Thread.sleep(500);
			}
			catch (InterruptedException ie)
			{
				System.out.println(ie);System.out.println("running3");
			}
		}
		System.out.println("running4");
	}
}
