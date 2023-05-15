package global;

import java.util.HashMap;
import static global.Resource.*;

public class Storage {
	
	private HashMap<Resource, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		Storage foo = new Storage();
		Storage bar = new Storage();
		foo.add(WOOD, 10);
		System.out.println(foo);
		foo.add(CLAY, 30);
		System.out.println(foo);
		bar.add(STONE, 10);
		System.out.println(bar);
		bar.add(WOOD, 7);
		System.out.println(bar);
		foo.add(bar);
		System.out.println(foo);
		System.out.println(bar);


		
		
	}

	
	public Storage() {
		
	}
	
	public String toString() {
		return map.toString();
	}
	
	public HashMap<Resource, Integer> getMap() {
		return map;
	}

	public int getCount(Resource type) {
		return map.get(type);
	}

	public void add(Resource type, int count) {
		map.merge(type, count, Math::addExact);
	}
	
//	public void pass(Resource type, Storage storage) {
//		
//	}
//	
//	public void pass(Storage storage) {
//		
//	}
	
	public void add(Storage storage) {
		storage.getMap().forEach(this::add);;
	}
	


}
