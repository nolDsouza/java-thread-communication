public class ThreadMain {
	private String read;
	
	public static void main(String[] args) {
		System.out.println("Enter text to be passed to thread: ");
		String read = new In().readLine();
		InputThread input = new InputThread(read);
		Thread thread = new Thread(input);
		thread.start();
	}
}
