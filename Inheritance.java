final class SuperClass
{
	public void method1()
	{
		System.out.println("method1 executed");	
	}
}
class EgInheritance extends SuperClass
{
	public static void main(String[] args)
	{
		EgInheritance egi=new EgInheritance();
		egi.method1();
	}
}