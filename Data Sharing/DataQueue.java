import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DataQueue {
	private BlockingQueue<EnumeratedString> queue;

	public DataQueue() {
		queue = new LinkedBlockingQueue<EnumeratedString>(1);
	}

	public void put(EnumeratedString data) {
		try {
			queue.put(data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String take() {
		String data = null;
		try {
			data = queue.take().toString();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return data;
	}
}
