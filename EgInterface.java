interface Interface1
{
	int a=32;
	public abstract void method1();
	public abstract void method2();
}
class EgInterface implements Interface1
{
	public void method1()
	{
				System.out.println("method1 implemented");
	}
	public void method2()
	{
		System.out.println("method2 implemented");
	}
	public static void main(String[] args)
	{
		EgInterface egi=new EgInterface();
		egi.method1();
		egi.method2();
		System.out.println(Interface1.a);
	}
}