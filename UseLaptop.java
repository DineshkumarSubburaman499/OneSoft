package day2;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1. brand = "Lenovo";
		l1. price = 30000;
		l1. colour = "Red";
		l1. discountamt = 1200;
		l1. isTouchScreen = false;
		l1.netPrice = l1.price - l1.discountamt;
		Laptop l2 = new Laptop();
		l2. brand = "Asus";
		l2. price = 32000;
		l2. colour = "Black";
		l2. discountamt = 1500;
		l2. isTouchScreen = true;
		l2.netPrice = l2.price - l2.discountamt;
		Laptop l3 = new Laptop();
		l3. brand = "HP";
		l3. price = 35000;
		l3. colour = "Silver";
		l3. discountamt = 1800;
		l3. isTouchScreen = false;
		l3.netPrice = l3.price - l3.discountamt;
System.out.println("Brand = "+l1.brand+"Price = "+l1.price+"Colour = "+l1.colour+"Discount ="+l1.discountamt+"Netprice = "+l1.netPrice);
System.out.println("Brand = "+l2.brand+"Price = "+l2.price+"Colour = "+l2.colour+"Discount ="+l2.discountamt+"Netprice = "+l2.netPrice);
System.out.println("Brand = "+l3.brand+"Price = "+l3.price+"Colour = "+l3.colour+"Discount ="+l3.discountamt+"Netprice = "+l3.netPrice);
			}
}
