package project2;

import java.awt.CardLayout;

public class HumanCar extends car implements Itranhuman
{
	private int SeatCount;
	
	public HumanCar (String name,int price,int SeatCount)
	{
		super(name,price);
		this.SeatCount = SeatCount;
	}
	
	public String getCapacity()
	{
		return "载人:" + SeatCount + "人"; 
	}

	public int getSeatCount()
	{
		return SeatCount;
	}

	public void setSeatCount(int seatCount)
	{
		this.SeatCount = seatCount;
	}
	
}
