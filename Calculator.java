package Week3.day1;

public class Calculator {

	public void add(int a,int b)
	{
		System.out.println((a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println((a+b+c));
	}
	public void multiply(int a,int b)
	{
		System.out.println((a*b));
	}
	public void multiply(int a,double b)
	{
		System.out.println((a*b));
	}
	public void sub(int a,int b)
	{
		System.out.println((a-b));
	}
	public void sub(double a,double b)
	{
		System.out.println((a-b));
	}
	public void div(int a,int b)
	{
		System.out.println((a/b));
	}
	public void div(double a,double b)
	{
		System.out.println((a/b));
	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(10, 20);
		cal.add(10, 20, 30);
		cal.multiply(10, 20);
		cal.multiply(10, 52.5);
		cal.sub(200, 500);
		cal.sub(85.5, 25.43);
		cal.div(1000, 500);
		cal.div(845.3, 10.56);
		
	}

}
