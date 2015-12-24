package parameterisedConstructor;

public class Employee {

	private String name;
	private String emailId;
	private int Salary;
	
	public Employee(String emailId){
		this.emailId = emailId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emailId=" + emailId + ", Salary="
				+ Salary + "]";
	}
	
}
