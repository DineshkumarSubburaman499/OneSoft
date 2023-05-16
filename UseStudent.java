package day2;

public class UseStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "X";
		s1.tamilmark = 90;
		s1.englishmark =91;
		s1.mathsmark = 92;
		s1.phymark = 93;
		s1.chemmark = 94;
		s1.biologymark = 95;
		s1.exmnumber = 3131;
		s1.average = (s1.tamilmark+s1.englishmark+s1.mathsmark+s1.phymark+s1.chemmark+s1.biologymark)/6;
		System.out.println("Name ="+s1.name+"Exam number ="+s1.exmnumber+"Avg ="+s1.average);
		//Student s2 = new Student();
		s2.name = "Y";
		s2.tamilmark = 80;
		s2.englishmark =81;
		s2.mathsmark = 82;
		s2.phymark = 83;
		s2.chemmark = 84;
		s2.biologymark = 85;
		s2.exmnumber = 3131;
		s2.average = (s2.tamilmark+s2.englishmark+s2.mathsmark+s2.phymark+s2.chemmark+s2.biologymark)/6;
		System.out.println("Name ="+s2.name+"Exam number ="+s2.exmnumber+"Avg ="+s2.average);
	}
}
