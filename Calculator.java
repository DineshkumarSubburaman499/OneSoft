package day2;

public class Calculator
{
String brand;
int price;
String colour;
public int add(int a,int b)
{
	return(a+b);
}
public int sub()
{
	int a = 10;
	int b = 5;
	return a-b;	
}
public void multi(int a,int b,int c)
{
	System.out.println(a*b*c);
}
public void div()
{
	int a = 10;
	int b = 2;
	System.out.println(a/b);
}
}
