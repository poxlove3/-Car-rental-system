package project2;

public abstract class car
{
	private String name;
	private int price;
	public car(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	
	public abstract String getCapacity();

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}
	
}
