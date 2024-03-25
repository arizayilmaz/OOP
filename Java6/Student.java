package OOP5;

public class Student {
	int id;
	String name;
	 int midTerm,finalExam;
	 
	 Student(int id, String name, int midTerm, int finalExam){
		 this.id = id;
		 this.name = name;
		 this.midTerm = midTerm;
		 this.finalExam = finalExam;
	 }
	 public String toString() { 
		 return name;
	 }

}
