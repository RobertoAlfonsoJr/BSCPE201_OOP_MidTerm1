import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	private String name;
	private String bday;
	private String address;
	private String job;
	private double rate;
	
	public Employee(String name, String bday, String address, String job, double rate){
		this.name = name;
		this.bday = bday;
		this.address = address;
		this.job = job;
		this.rate = rate;
	}
	public String getName(){
		return name;
	}
	public String getBday(){
		return bday;
	}
	public String getAddress(){
		return address;
	}
	public String getJob(){
		return job;
	}
	public double getRate(){
		return rate;
	}
}

class Test {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		
		do {
			
			System.out.println("Select Activity: ");
			System.out.println("1. Add Employees.");
			System.out.println("2. Display all Employees.");
			System.out.println("3. Exit Console");
			
			System.out.print("Option: ");
			int option = scan.nextInt();
			
			switch(option) {
				case 1: employees.add(addEmployee());
				break;
				case 2: displayEmployees(employees);
				break;
				case 3: exit = true;
				break;
			}
			
		} while (!exit);
		
	}
	public static Employee addEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = scan.nextLine();
		System.out.print("Enter Employee Birthday: ");
		String bday = scan.nextLine();
		System.out.print("Enter Employee Address: ");
		String address = scan.nextLine();
		System.out.print("Enter Employee Job Position: ");
		String job = scan.nextLine();
		System.out.print("Enter Employee Rate: ");
		double rate = scan.nextDouble();
		return new Employee(name, bday, address, job, rate);
		
	}
	public static void displayEmployees(ArrayList<Employee> employees){
		if(employees.isEmpty()) {
			System.out.println("Cannot find employee record.");
			return;
			
		}
		System.out.println("List of Employees");
		for(Employee employee : employees) {
			System.out.println("ID: " + employees.indexOf(employee) + 
				", Name: " + employee.getName() + 
				", Birthday: " + employee.getBday() + 
				", Address: " + employee.getAddress() + 
				" Job Position: " + employee.getJob() +
				", Rate: " + employee.getRate());
		}
	}
}