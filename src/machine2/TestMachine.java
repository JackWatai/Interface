package machine2;

import java.util.Scanner;

public class TestMachine {
	public static void main(String[] args) {
		System.out.println("INSERT COIN TO PLAY!");
		System.out.println("");
		ArcadeMachine arcadeMachine = new ArcadeMachine();
		Person person = new Person(5);
		
		person.insertCoin(arcadeMachine);	
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		
	}
}
