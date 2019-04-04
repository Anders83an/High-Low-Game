import java.util.Scanner;

public class GameStart {

	public void gameStart() {
		System.out.println("Välkommen till HiLo spelet!");
		System.out.println("Vilken svårighetsgrad vill du köra?");
		System.out.println("1. Lätt (1-10)");
		System.out.println("2. Medel (1-100)");
		System.out.println("3. Svår (1-1000)");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int[] arr = {1,2,3};
		
		int dittVal = scan.nextInt();
		
		if(dittVal == 1) {
			PlayGame.playGame("Lätt spel. ", 10);
		}
		else if(dittVal == 2) {
			PlayGame.playGame("Medel spel. ", 100);
		}
		else if(dittVal == 3) {
			PlayGame.playGame("Svårt spel. ", 1000);
		}
		else if(dittVal > 3) {
			System.out.println("Du måste välja 1, 2 eller 3.");
			System.out.println("");
			gameStart();
		}
	}

	
		
}
