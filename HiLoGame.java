import java.util.Scanner;

public class HiLoGame 
{
	private boolean done = false;
	
	private Scanner console = new Scanner(System.in);
	
	
	private int countOfGuesses; 
	
	private int guess;
	
	
	private int number;
	
	private int high;
	
	private int low;
	
	public HiLoGame(int aNumber, int aHigh, int aLow)
	{
		
		number = aNumber;
		
		high = aHigh;
		
		low = aLow;
		
	}
	
	public void play()
	{
		
		while(!done)
		{
			
			System.out.println("Try to guess a number between " + low + " and " + high +".");
			System.out.println("guess: ");
			guess = console.nextInt();
			
			if (guess > number)
			{
				System.out.println("lower");
				
				System.out.println("Try to guess a number between " + low + " and " + high +".");
				
				if(guess < high)
				{
					high = guess;
					
					countOfGuesses++;
				}
				
			}
			
			if (guess < number)
			{
				System.out.println("higher");
				
				System.out.println("Try to guess a number between " + low + " and " + high +".");
				
				if (guess > low)
				{
					
					low = guess;
					
					countOfGuesses++;
					
				}
				
			}
			
			if(guess==number)
			{
				System.out.println("Guesses: " + countOfGuesses);
				
				done = true;
			}
			
		}
		
	}
	

	
}
