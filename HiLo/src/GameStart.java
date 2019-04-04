import java.util.Scanner;

public class GameStart {

	public void gameStart() {
		System.out.println("V�lkommen till HiLo spelet!");
		System.out.println("Vilken sv�righetsgrad vill du k�ra?");
		System.out.println("1. L�tt (1-10)");
		System.out.println("2. Medel (1-100)");
		System.out.println("3. Sv�r (1-1000)");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int[] arr = {1,2,3};
		
		int dittVal = scan.nextInt();
		
		if(dittVal == 1) {
			PlayGame.playGame("L�tt spel. ", 10);
		}
		else if(dittVal == 2) {
			PlayGame.playGame("Medel spel. ", 100);
		}
		else if(dittVal == 3) {
			PlayGame.playGame("Sv�rt spel. ", 1000);
		}
		else if(dittVal > 3) {
			System.out.println("Du m�ste v�lja 1, 2 eller 3.");
			System.out.println("");
			gameStart();
		}
	}

	
		
}
