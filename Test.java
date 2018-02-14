package project2;
import java.util.Scanner;

public class Test
{
	public static final car[] CARS =
	{ 
		new HumanCar("奥迪A4", 500, 4),
		new HumanCar("马自达6", 400, 4), 
		new GoodCar("大卡车", 600, 3),
		new HumanGoodCar("皮卡雪6", 450, 4, 2),
		new HumanCar("金龙", 800, 20),
		new GoodCar("松花江", 400, 4),
		new GoodCar("依维柯", 1000, 20)
	};

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("欢迎使用杨少凯租车系统：%n您是否要租车：1是；0否%n");
		int yesOrNo = scanner.nextInt();
		if (yesOrNo == 0)
		{
			System.out.println("感谢您的支持，下次再见");
		}
		if (yesOrNo == 1)
		{
			System.out.printf("%n您可租车的类型及其价目表：%n");
			System.out.println("序号\t汽车名称\t租金\t\t容量");
			for (int i = 0; i < CARS.length; i++)
			{
				System.out.printf("%d.\t %s\t %d元/天\t %s%n", i + 1, CARS[i].getName(), 
				CARS[i].getPrice(),CARS[i].getCapacity());
			}
			System.out.printf("%n请输入您要租车的数量：%n");
			int count = scanner.nextInt();
			int[] choices = new int[CARS.length];
			System.out.println("CARS.length的值为 " + CARS.length);
			for (int i = 0; i < count; i++)
			{
				System.out.printf("请输入第%d辆车的序号：%n", i + 1);
				int no = scanner.nextInt() - 1;
				choices[no]++;
			}
			System.out.printf("%n请输入租车天数：%n");
			int days = scanner.nextInt();
			System.out.printf("%n您的帐单：%n");
			System.out.println("***可裁人的车有：");
			int seatCountTotal = 0;
			for (int i = 0; i < choices.length; i++)
			{
				if(choices[i] != 0 && CARS[i] instanceof Itranhuman)
				{
					System.out.printf("%s*%d ", CARS[i].getName(), choices[i]);
					seatCountTotal += ((Itranhuman) CARS[i]).getSeatCount() * choices[i];
				}
			}
			System.out.printf("共载人：%d人%n", seatCountTotal);
			System.out.println("***可裁货的车有：");
			int goodWeightTotal = 0;
			for (int i = 0; i < choices.length; i++)
			{
				if (choices[i] != 0 && CARS[i] instanceof Itrangood)
				{
					System.out.printf("%s*%d ", CARS[i].getName(), choices[i]);
					goodWeightTotal += ((Itrangood) CARS[i]).getGoodWeight() * choices[i];
				}
			}
			System.out.printf("共载货：%d吨%n", goodWeightTotal);
			int priceTotal = 0;
			for (int i = 0; i < choices.length; i++)
			{
				if (choices[i] != 0)
				{
					priceTotal += CARS[i].getPrice() * choices[i];
				}
			}
			System.out.printf("***租车总价格：%d元%n", priceTotal * days);
		}
		scanner.close();
	}

}
