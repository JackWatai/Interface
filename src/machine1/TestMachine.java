package machine1;

public class TestMachine {
	public static void main(String[] args) {
		System.out.println("1 GUMBALL = 3 COINS");
		System.out.println("");
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person(5);
		
		person.intsertCoin(gumballMachine, 4);
		System.out.println("");
		person.intsertCoin(gumballMachine, 5);
		System.out.println("");
		person.intsertCoin(gumballMachine, 2);
		System.out.println("");
		person.intsertCoin(gumballMachine, 3);
		System.out.println("");
		person.intsertCoin(gumballMachine, 4);
		
		
	
		
	}
}
