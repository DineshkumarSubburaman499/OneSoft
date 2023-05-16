package day2;

public class UseCar {
public static void main(String[] args) {
	Car c1 = new Car();
	Car c2 = new Car();
	Car c3 = new Car();
	c1.brand = "Tata";
	c1.colour = "Red";
	c1.isTubeless = true;
	c1.model = "TATA ALTROZ";
	c1.price = 200000;
	c1.taxPercentage = 15;
	c1.netprice = c1.price+(c1.price*c1.taxPercentage/100);
	System.out.println("Brand = "+c1.brand+"Netprice = "+c1.netprice);
	c2.brand = "Benz";
	c2.colour = "Black";
	c2.isTubeless = false;
	c2.model = "BENZ CZ";
	c2.price = 250000;
	c2.taxPercentage = 15;
	c2.netprice = c2.price+(c2.price*c2.taxPercentage/100);
	System.out.println("Brand = "+c2.brand+"Netprice = "+c2.netprice);
	c3.brand = "Innova";
	c3.colour = "Green";
	c3.isTubeless = true;
	c3.model = "INNOVA Z2";
	c3.price = 270000;
	c3.taxPercentage = 15;
	c3.netprice = c3.price+(c3.price*c3.taxPercentage/100);
	System.out.println("Brand = "+c3.brand+"Netprice = "+c3.netprice);
}
}
