package day2;

public class UseStudent1 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s.name = "Siva";
		s.class1 = "1X";
		s.age = 14;
		s.id = 234;
		s.noofdays = 240;
		s.percentage = 75;
		s.phNumber = 9865205927l;
		s1.name = "Siva";
		s1.class1 = "1X";
		s1.age = 14;
		s1.id = 234;
		s1.noofdays = 240;
		s1.percentage = 80;
		s1.phNumber = 7358758297l;
		s2.name = "Siva";
		s2.class1 = "1X";
		s2.age = 14;
		s2.id = 234;
		s2.noofdays = 240;
		s2.percentage = 90;
		s2.phNumber = 9500358231l;
		System.out.println("No of Days ="+s.noofdays*s.percentage/100);
		System.out.println("No of Days ="+s1.noofdays*s1.percentage/100);
		System.out.println("No of Days ="+s2.noofdays*s2.percentage/100);
	    System.out.println("Ph number ="+"91"+s.phNumber);
	    System.out.println("Ph number ="+"91"+s1.phNumber);
	    System.out.println("Ph number ="+"91"+s2.phNumber);
}
}
