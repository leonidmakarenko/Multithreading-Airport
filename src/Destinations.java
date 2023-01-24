import java.util.PriorityQueue;
import java.util.Queue;

enum Destinations {
	KALUSH, KOSIV, GALYCH, KOLOMIYA;

	private final Queue<Family> queue;
	private int personInQueueCount;

	Destinations() {
		this.queue = new PriorityQueue<>();
	}

	public Queue<Family> getQueue() {
		return queue;
	}

	public int getPersonInQueueCount() {
		return personInQueueCount;
	}

	public void setPersonInQueueCount(int personInQueueCount) {
		this.personInQueueCount = personInQueueCount;
	}

}