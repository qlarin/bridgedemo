
public class BridgeTest {

	public static void main(String[] args){
		Monster normalMonster = new Wolf(123, 30, new NormalMonster());
		Monster eliteMonster = new Wolf(129, 30, new EliteMonster());
		
		normalMonster.spawn();
		eliteMonster.spawn();
	}
}
