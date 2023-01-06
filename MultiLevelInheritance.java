// Java Program to implement Multi Level Inheritance

class A
{
	public void displayA()
	{
		System.out.println("displayA() method in class A executed which is parent class of class B");
	}
}
class B extends A
{
	public void displayB()
	{
		System.out.println("displayB() method in class B executed which is parent class of class C and child class of class A");	
	}
}
class MultiLevelInheritance extends B
{
	public static void main(String[] args)
	{
		MultiLevelInheritance mi=new MultiLevelInheritance();
	        mi.displayB();
		mi.displayA();
	}
}