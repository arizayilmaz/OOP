package OOP4;

enum CompanyName{
	MICROSOFT("Google was founded in 1998 by Larry Page and Sergey Brin while"),
	GOOGLE("Microsoft Corporation is a technology company with headquarters in Redmond, Washington");
	
	 String description;
	
	private CompanyName(String desc) {
		this.description = desc;
	}
}

public class Company {
	Employee[] employees;
	CompanyName cName;

	public Company(Employee[] emps,CompanyName cName) {
		this.employees = emps;
		this.cName = cName;
	}
	
	public CompanyName getCompanyName() {
		return cName;
	}
		
}
