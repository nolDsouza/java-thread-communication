
public class ThreadMain {
	private static DataQueue queue;
	
	public static void main(String[] args) {
		queue = new DataQueue();
		InputThread receiver = new InputThread(queue);
		PrinterThread printer = new PrinterThread(queue);

		new Thread(receiver).start();
		new Thread(printer).start();
	}
}
