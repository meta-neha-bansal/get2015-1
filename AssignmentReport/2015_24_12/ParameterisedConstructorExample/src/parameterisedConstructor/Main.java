package parameterisedConstructor;

public class Main {

	public static void main(String args[]){
		String email = "abc@metacube.com";
		Employee emp = new Employee(email);
		System.out.println("Employee : " + emp);
	}
}
