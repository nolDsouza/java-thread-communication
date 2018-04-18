public class PrinterThread implements Runnable {
	private DataQueue queue;

	public PrinterThread(DataQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			String data = queue.take();
			if (data == null) break;
			System.out.println("Printed data: " + data);
		}
	}
}
