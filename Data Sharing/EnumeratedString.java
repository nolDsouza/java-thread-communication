public class EnumeratedString {
	final static String POISON = "X";
	private static int count = 0;
	private String data;
	private String id;

	public EnumeratedString(String data) {
		count++;
		this.id = String.format("t%d", count);
		this.data = data;
	}

	public String toString() {
		if (data.equals(POISON)) {
			return null;
		}
		return String.format("ID: %s\nInput: %s\n", id, data);
	}

}
