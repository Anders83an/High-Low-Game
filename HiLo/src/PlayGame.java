import java.util.Scanner;

public class PlayGame {
	public static void playGame(String grad, int maxNumber) {
		int number = (int) (Math.random() * maxNumber) +1;
		System.out.println("Du valde " + grad + "Gissa rätt tal mellan 1-" + maxNumber +"."); // + " Slumpat tal: " +number
		giveResponse(maxNumber, number);
	}
	
	public static void giveResponse(int maxNumber, int number) {
		int i = 0;
		while(true) {
			Scanner scan = new Scanner(System.in);
			int gissatTal = scan.nextInt();
			
			if(gissatTal < number) {
				System.out.println("Du gissade för lågt, försök igen!");
			}
			else if(gissatTal > number) {
				System.out.println("Du gissade för högt, försök igen!");
			}
			else if(gissatTal == number) {
				System.out.println("Du gissade rätt!, Grattis!");
				System.out.println("Du har nu gissat " + (i+1) + " gånger.");
			}
			i = i + 1;
			
		}
		
	}
	
}
