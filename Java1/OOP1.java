package OOP1;

public class OOP1 {
	public static void main(String[] args)
	{
//  C ile yazılsaydı Class kullanılmadan bu halde olacaktı.		
//		String name = "Jack";
//		int id =3453;
//		int midTerm = 45;
//		int finalExam = 89;
//		
//		ShowStudentInfoAndScore(name,midTerm,finalExam);
//		
//	}
//	
//	private static float CalculateScore (int m, int f) 
//	{
//		return m*0.4f + f*0.6f;
//	}
//	
//	private static void ShowStudentInfoAndScore(String name, int m, int f) 
//	{
//		float score = CalculateScore(m,f);
//		System.out.printf("name: %s score %f",name,score);
		
		Student student = new Student();  // öğrenci oluşturduk Student classından.
		student.name ="Jack";
		student.id =4556;
		student.midTerm = 67;
		student.finalExam =90;
		student.showAllInfo();
		
	}

}
