package colony;

import global.Storage;

public abstract class Building {
	private String name;
	private boolean isBuilt = false;
	private Storage itemsNeeded; // Total items needed to build the building
	/**
	 * 
	 */
	public String toString() {
		return name;
	}
	public boolean build(Storage source) {
		if(source.has(itemsNeeded))
	}
}
