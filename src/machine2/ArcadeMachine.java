package machine2;

public class ArcadeMachine implements Coinable, Dispensable {
int coins;
public ArcadeMachine() {
	this.coins = 0;
}
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You inserted 1 coin");
		System.out.println("Arcade is ready to play!");
		System.out.println("GAME OVER!");
		coins++;
		System.out.println("Total coins earned by the machine: " + coins);
		
	}
	
	@Override
	public boolean insertCoin() {
		// TODO Auto-generated method stub
		this.dispense();
		
		return true;
	}

}
