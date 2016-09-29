
public class Card
	{
private int ranking;
private  String suit;
private String name;
private  int number;
	public Card(int r, String t, String n, int num)
	{
		ranking=r;
		suit=t;
		name=n;
		number=num;
	}
	public int getRanking()
		{
			return ranking;
		}
	public void setRanking(int ranking)
		{
			this.ranking = ranking;
		}
	public String getSuit()
		{
			return suit;
		}
	public void setSuit(String suit)
		{
			this.suit = suit;
		}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public int getNumber()
		{
			return number;
		}
	public void setNumber(int number)
		{
			this.number = number;
		}
}