package identifier;
import java.util.*;

class Guesser{
	int guessNum;
	int guessRange;
	
	int guessRange()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Kindly Guess The Range: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Kindly Guess The Number: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
}


class Player{
	int guessNum;
	
	int guessNum1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1 Kindly Guess The Number: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
	int guessNum2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 2 Kindly Guess The Number: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
	int guessNum3()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 3 Kindly Guess The Number: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Umpire{
	int numFromGuesser;
	int rangeFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser G = new Guesser();
		numFromGuesser = G.guessNum();
		
	}
	
	void collectGuessRangeFromGuesser()
	{
		Guesser G = new Guesser();
		rangeFromGuesser = G.guessRange();
	}
	
	void collectNumFromPlayers()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNum1();
		numFromPlayer2 = p2.guessNum2();
		numFromPlayer3 = p3.guessNum3();
	}
	
	void compare()
	{
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
			{
				System.out.println("All Players Won The Game.");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 Won the Game.");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 Won the Game.");
			}
			else
			{
				System.out.println("Player 1 Won The Game.");
			}
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player 2 and Player 3 Won the Game.");
			}
			else
			{
			System.out.println("Player 2 Won The Game.");
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player 3 Won The Game.");
		}
		else 
		{
			System.out.println("You Lost The Game, Try Again!!");
		}
	}
	
	void range()
	{
		if(numFromPlayer1 > rangeFromGuesser)
		{
			if(numFromPlayer2 > rangeFromGuesser && numFromPlayer3 > rangeFromGuesser)
			{
				System.out.println("All Players Have Entered Out of Range Number.");
			}
			else if(numFromPlayer2 > rangeFromGuesser)
			{
				System.out.println("Player 1 and Player 2 Have Entered Out Of Range Number.");
			}
			else if(numFromPlayer3 > rangeFromGuesser)
			{
				System.out.println("Player 1 and Player 3 Have Entered out Of Range Number.");
			}
			else
			{
				System.out.println("Player 1 Have Entered Out of range Number.");
			}	
		}
		else if(numFromPlayer2 > rangeFromGuesser)
		{
			if(numFromPlayer3 > rangeFromGuesser )
			{
				System.out.println("Player 2 and Player 3 Have Entered Out Of Range Number.");
			}
			else
			{
				System.out.println("Player 2 Have Entered Out of range Number.");
			}
		}
		else if(numFromPlayer3 > rangeFromGuesser)
		{
			System.out.println("Player 3 Have Entered Out Of Range Namber.");
		} 
	}
	
}

public class GusserGameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectGuessRangeFromGuesser();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		u.range();
	}
}
