import java.util.Random;
import java.util.Scanner;

public class HiLoTest 
{

	public static void main(String[] args) 
	{
		
		Random rand = new Random();
		int n = rand.nextInt((100) + 1);
		
		System.out.println("Try to guess a computer-generated number between 1 and 100.");
		
		HiLoGame game = new HiLoGame(n, 100, 1);
		
		game.play();
		
	}

}
