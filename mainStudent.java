package OOP2;

import OOP2_1.Student;

public class mainStudent {
	public static void main(String[] args) 
	{
//		Student s = new Student();
//		s.name = "Ahmet";
//		s.midTerm = 90;
//		s.finalExam = 49;
//		System.out.print(s.getResult());
		Student s1 = new Student();
		Student s2 = new Student("Ali",70,60);
		System.out.print(s2.getResult());
		
	}

}  
