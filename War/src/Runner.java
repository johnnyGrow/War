import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Runner
	{
		static boolean stillPlaying=true;
		static ArrayList<Card>deck=new ArrayList<Card>();
		static int compScore;
		static int playerScore;
		public static void main(String[] args)
			{
				playerScore=0;
				compScore=0;
				System.out.println("lets play war!! First to 22 wins");
				
				while(stillPlaying)
					{
						dealCards();
						if(compScore>21 || playerScore>21)
							{
						 stillPlaying=false;
							}
					}
				
			}
		public static void fillDeck()
			{
				
		deck.add(new Card(2,"Hearts","2",1));
		deck.add(new Card(3,"Hearts","3",2));
		deck.add(new Card(4,"Hearts","4",3));
		deck.add(new Card(5,"Hearts","5",4));
		deck.add(new Card(6,"Hearts","6",5));
		deck.add(new Card(7,"Hearts","7",6));
		deck.add(new Card(8,"Hearts","8",7));
		deck.add(new Card(9,"Hearts","9",8));
		deck.add(new Card(10,"Hearts","10",9));
		deck.add(new Card(11,"Hearts","Jack",10));
		deck.add(new Card(12,"Hearts","Queen",11));
		deck.add(new Card(13,"Hearts","King",12));
		deck.add(new Card(14,"Hearts","Ace",13));
		deck.add(new Card(2,"Clubs","2",14));
		deck.add(new Card(3,"Clubs","3",15));
		deck.add(new Card(4,"Clubs","4",16));
		deck.add(new Card(5,"Clubs","5",17));
		deck.add(new Card(6,"Clubs","6",18));
		deck.add(new Card(7,"Clubs","7",19));
		deck.add(new Card(8,"Clubs","8",20));
		deck.add(new Card(9,"Clubs","9",21));
		deck.add(new Card(10,"Clubs","10",22));
		deck.add(new Card(11,"Clubs","Jack",23));
		deck.add(new Card(12,"Clubs","Queen",24));
		deck.add(new Card(13,"Clubs","King",25));
		deck.add(new Card(14,"Clubs","Ace",26));
		deck.add(new Card(2,"Spades","2",27));
		deck.add(new Card(3,"Spades","3",28));
		deck.add(new Card(4,"Spades","4",29));
		deck.add(new Card(5,"Spades","5",30));
		deck.add(new Card(6,"Spades","6",31));
		deck.add(new Card(7,"Spades","7",32));
		deck.add(new Card(8,"Spades","8",33));
		deck.add(new Card(9,"Spades","9",34));
		deck.add(new Card(10,"Spades","10",35));
		deck.add(new Card(11,"Spades","Jack",36));
		deck.add(new Card(12,"Spades","Queen",37));
		deck.add(new Card(13,"Spades","King",38));
		deck.add(new Card(14,"Spades","Ace",39));
		deck.add(new Card(2,"Diamonds","2",40));
		deck.add(new Card(3,"Diamonds","3",41));
		deck.add(new Card(4,"Diamonds","4",42));
		deck.add(new Card(5,"Diamonds","5",43));
		deck.add(new Card(6,"Diamonds","6",44));
		deck.add(new Card(7,"Diamonds","7",45));
		deck.add(new Card(8,"Diamonds","8",46));
		deck.add(new Card(9,"Diamonds","9",47));
		deck.add(new Card(10,"Diamonds","10",49));
		deck.add(new Card(11,"Diamonds","Jack",50));
		deck.add(new Card(12,"Diamonds","Queen",51));
		deck.add(new Card(13,"Diamonds","King",52));
		deck.add(new Card(14,"Diamonds","Ace",53));
		
			}
		public static void dealCards()
		{
			Collections.shuffle(deck);
			System.out.println("YOU : "+deck.get(0).getSuit()+" "+deck.get(0).getName());
			System.out.println("COMPUTER : "+deck.get(1).getSuit()+" "+deck.get(1).getName());
			if(deck.get(0).getRanking()<deck.get(1).getRanking())
				{
					compScore=compScore+2;
					System.out.println("You lost that hand your score is "+playerScore+" the Computer's score is "+compScore);

				}
			if(deck.get(0).getRanking()>deck.get(1).getRanking())
				{
					playerScore=playerScore+2;
					System.out.println("You won that hand your score is "+playerScore+" the Computer's score is "+compScore);
				}
		}
	
	}
