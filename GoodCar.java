package project2;

public class GoodCar extends car implements Itrangood
{
	private int GoodWeight;
	public GoodCar(String name,int price,int goodWeight)
	{
		super(name, price);
		this.GoodWeight = goodWeight;
	}
	
	public String getCapacity()
	{
		return "载重" + GoodWeight + "吨";
	}
	
	public int getGoodWeight()
	{
		return GoodWeight;
	}
	
	public void setGoodWeight(int goodWeight)
	{
		this.GoodWeight = goodWeight;
	}
	
	
}
