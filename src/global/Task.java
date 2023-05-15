package global;

public abstract class Task implements Comparable<Task>{
	private boolean isDone = false;
	private int priority;
	
	public abstract boolean canDo();
	public abstract boolean canDoEver();
	public abstract void doTask();
	public abstract String toString();
	
	public int getPriority() {
		return priority;
	}
	
	public int compareTo(Task task) {
		return this.getPriority() - task.getPriority();
	}
	public boolean getIsDone() {
		return isDone;
	}
}
