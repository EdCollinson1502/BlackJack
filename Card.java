public class Card
{
    private int value;
    private String suit;
    private String tier;
    
    public Card(int v, String s, String r)
    {
        // initialise instance variables
        this.value = v;
        this.suit = s;
        this.tier = r;
    }

    public String getSuit()
    {
        return suit;
    }
    
    public void setAceValue(){
        value = 2;
    }
    
    public String gettier()
    {
        return tier;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String toString()
    {
        return this.tier + " of " + this.suit + " Value: " + this.value + "\n";
    }
}
