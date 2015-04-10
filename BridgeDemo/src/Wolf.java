
public class Wolf extends Monster{

	private int x,y;
	
	public Wolf(int x, int y, SpawnAPI spawnAPI){
		super(spawnAPI);
		this.x = x;
		this.y = y;
	}
	
	public void spawn(){
		spawnAPI.spawnMonster(x, y);
	}
}
