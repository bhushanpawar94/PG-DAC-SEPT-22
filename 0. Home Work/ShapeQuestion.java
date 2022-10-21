public class Shape
{
	private double height;
	private double width;

	public void setValues(double height,double width)
	{
	this.height = height;
	this.width = width;
	}
	public double getHeight()
	{
	return height;
	}

	public double getWidth()
	{
	return width;
	}
}

public class Rectangle extends Shape
{
	public double getArea()
	{
		return getHeight() * getWidth();
	}
}

public class Triangle extends Shape
{
	public double getArea()
	{
		return(getHeight() * getWidth()) / 2;
	}
}


public class ShapeQuestion
{
	public static void main(String args[])
	{
		Shape = shape;
		
		Rectangle rect = new Rectangle();
		
		shape = rect ;
		
		shape.setValues(90,4);
		
		System.out.println("Area of Rect is :: "+rect.getArea()+"square mtr");
		
		Traingle tri = new Traingle();
		shape = tri;
		
		shape.setValues(8,11);
		
		System.out.println("Area of Traingle is :: "+tri.getArea()+"Sqaure mtr");
	}
}
