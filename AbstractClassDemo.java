package javapack;

abstract class Shape
{
	abstract void area();
	public void show()
	{
		System.out.println("Show method in abstract class");
	}
}
class Rectangle extends Shape
{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
		//show();
	}
	public void area()
	{
		System.out.println("Area of Rect:"+(l*b));
	}
}
class Triangle extends Shape
{
	int l,b;
	Triangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		System.out.println("Area of Tri:"+(0.5*l*b));
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(10,20);
        r.area();
        r.show();
	}

}
