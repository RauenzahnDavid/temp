package colony;
import java.util.PriorityQueue;

import global.Task;

public class Person {

	private String name;
	private String faction;

	private boolean injured = false;
	private boolean conscious = true;
	private boolean idle = true;
	private boolean onExpedition = false;

	private PriorityQueue<Task> tasks = new PriorityQueue<>();

	private int hunger; // Person can go without food for 3 days
	public static int HUNGER_MAX = 90;

	private int energy; // Person falls unconscious if reaches 0
	public static int ENERGY_MAX = 90;

	// CONSTRUCTORS
	public Person(String name) {

		this.name = name;
		setFaction(null);
		setHunger(HUNGER_MAX);
		setEnergy(ENERGY_MAX);

	}

	// EXTERNAL METHODS

	public void tick() {
//		doTask(); TODO
//		updateStats(); TODO

	}

	/**
	 * If the task can ever be done, gives the task to the person and returns true. Otherwise returns false.
	 */
	public boolean offerTask(Task task) {
		boolean validTask = task.canDoEver();
		if (validTask) {
			tasks.add(task);
		}
		return validTask;
	}

	// INTERNAL METHODS

	// GETTERS AND SETTERS
	public void setFaction(String faction) {
		this.faction = faction; // TODO: Add safety checks
	}

	public String getFaction() {
		return faction;
	}

	public void setName(String name) {
		this.name = name; // TODO: Add safety checks
	}

	public String getName() {
		return name;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger; // TODO: Add safety checks
	}

	public int getHunger() {
		return hunger;
	}

	public void setEnergy(int energy) {
		this.energy = energy; // TODO: Add safety checks
	}

	public int getEnergy() {
		return energy;
	}

//	public abstract void attack();
//
//	public abstract void recieveTask();
//
//	public abstract void doTask();
//
//	public abstract void stopWork();

}
