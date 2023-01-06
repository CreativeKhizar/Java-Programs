// Java Program to implement Single Inheritance

class ParentClass
{
	public void display()
	{
		System.out.println("display() method from parent class is executed");
	}	
}
class SingleLevelInheritance extends ParentClass
{
	public static void main(String[] args)
	{
		SingleLevelInheritance si=new SingleLevelInheritance();
		si.display();
	}
}