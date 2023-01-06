import java.util.Random;
class EgDice
{
	public static void main(String args[])
	{
		int count=0;
		Random r=new Random();
		for(int i=1;i<=10000;i++)
		{
			int d1=r.nextInt(6)+1;
			int d2=r.nextInt(6)+1;
			if(d1==d2)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}