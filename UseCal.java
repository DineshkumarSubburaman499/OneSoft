package day2;

public class UseCal {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.brand = "X";
		c.price = 20;
		c.colour = "Black";
		System.out.println(c.add(10, 5));
		System.out.println(c.sub());
		c.multi(1, 2, 3);
		c.div();
	}
}
