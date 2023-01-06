import java.util.Scanner;
abstract class Abstract
{
	int a=30;
	public abstract void method1();
	public abstract void method2();
	public void concreteMethod()
	{
		System.out.println("Concrete Method executed");
	}
}
class EgAbstract extends Abstract
{
	public void method1()
	{
		System.out.println("Method1 Implemented");
	}
	public void method2()
	{
		System.out.println("Method2 Implemented");
	}
	public static void main(String[] args)
	{
		EgAbstract ega=new EgAbstract();
		ega.method1();
		ega.method2();
		ega.concreteMethod();
		System.out.println(ega.a);
	}
}