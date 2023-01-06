import java.util.Scanner;
class EgSuper
{
	String color="Orange";
	public double areaOfCircle(double r)
	{
		double area;
		area=3.14*r*r;
		return(area);
	}
}
class EgChild extends EgSuper
{
	public static void main(String[] args)
	{
		double r;
		Scanner obj=new Scanner(System.in);
		EgChild ec=new EgChild();
		System.out.println("Enter the radius of circle to know the area of it ");
		r=obj.nextDouble();
		System.out.println("Color = "+ec.color);	
		System.out.println("Area of Circle is "+ec.areaOfCircle(r));
		
	}
}