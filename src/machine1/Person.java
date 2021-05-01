package machine1;

public class Person {
	private int coins;
	private int price;

	
		public Person(int coins) {
			this.coins = coins;
			this.price = 3;
		}
		
		public void intsertCoin(Coinable coinable, int coins) {
			System.out.println("You inserted " + coins + " coins!");
			if(coins > 2) {
			if(!coinable.insertCoin()) {
				System.out.println(coins + " coins refunded");
			}
			else {
			coins = coins - price;	
			System.out.println("Your change is: " + coins + " coins");
			}
			}
			
			else {
				System.out.println("You do not have enough coins! " + coins + " coins returned");
			}
			
		}
}
