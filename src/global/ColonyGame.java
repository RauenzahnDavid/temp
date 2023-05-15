package global;
import colony.Colony;
import world.World;

public class ColonyGame {
	Colony colony = new Colony();
	World world;
	
	public ColonyGame() {
		
	}
	
	public void tick() {
		colony.tick();
		world.tick();
		
	}

}
