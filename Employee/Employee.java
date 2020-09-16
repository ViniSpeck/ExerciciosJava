public class Employee{
	private String name;
	private String surname;
	private double salary;
	
	public Employee(String name, String surname, double salary){
		setName(name);
		setSurname(surname);
		setSalary(salary);
	}
	
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public double getSalary(){
		return salary;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setSalary(double salary){
		if(salary>0){
			this.salary = salary;
		}
	}
}