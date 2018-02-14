package project2;

public class HumanGoodCar extends car implements Itrangood,Itranhuman
{
	private int seatCount;
	private int goodWeight;
	
	public HumanGoodCar(String name,int price,int seatCount,int goodWeight)
	{
		super(name, price);
		this.seatCount = seatCount;
		this.goodWeight = goodWeight;
	}
	
	public String getCapacity()
	{
		return "载人:" + seatCount + "人，载重:" + goodWeight + "吨";
	}
	
	public int getSeatCount()
	{
		return seatCount;
	}

	public void setSeatCount(int seatCount)
	{
		this.seatCount = seatCount;
	}

	public int getGoodWeight()
	{
		return goodWeight;
	}

	public void setGoodWeight(int goodWeight)
	{
		this.goodWeight = goodWeight;
	}
	
}
