public class ThreadMain {

	public static void main(String[] args) {
		InputThread input = new InputThread();
		Thread thread = new Thread(input);
		thread.start();
	}
}
