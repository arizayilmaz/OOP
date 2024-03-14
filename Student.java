package OOP1;

public class Student {
	String name;
	int id;
	int midTerm;
	int finalExam;
	
	float calculateScore() 
	{
		return midTerm*0.4f + finalExam*0.6f;
	}
	void showAllInfo()
	{
		System.out.println(name +" "+" "+ id +" "+calculateScore());
	}
}
