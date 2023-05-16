package day2;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1 = new Marker();
		m1.brand = "Doms";
		m1.price = 50;
		m1.colour ="Black";
		m1.isRefill =true;
		Marker m2 = new Marker();
		m2.brand = "Camel";
		m2.price = 30;
		m2.colour = "Red";
		m2.isRefill =false;
System.out.println("Brand="+m1.brand+"Price="+m1.price+"Colour="+m1.price+"Refill="+m1.isRefill);
System.out.println("Brand="+m2.brand+"Price="+m2.price+"Colour="+m2.price+"Refill="+m2.isRefill);
	}
}
