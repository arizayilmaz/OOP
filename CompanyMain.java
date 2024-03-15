package OOP4;

public class CompanyMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee(45,"Jack",4545);
		Employee emp2 = new Employee(34,"Arven",4545);
		Employee emp3 = new Employee(24,"John",4545);
		Employee emp4 = new Employee(32,"Scarlet",4545);
		
		Employee[] emps = {emp1,emp2,emp3,emp4};
		
		Company comp = new Company(emps,CompanyName.GOOGLE);
		
		for(Employee e : emps) {
			
			System.out.println("ID:" +e.id + " Name:" + e.getName()+ " SSN:" +e.ssn +" ->" +comp.getCompanyName());
		}
			
			
	}

}
