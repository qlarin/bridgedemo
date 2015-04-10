
public abstract class Monster {

	protected SpawnAPI spawnAPI;
	protected Monster(SpawnAPI spawnAPI){
		this.spawnAPI = spawnAPI;
	}
	public abstract void spawn();
}
