public class EmployeeTest {
	public static void printEmployeeData(Employee e){
		System.out.printf("Nome: %s %s, Salário: %.2f\n", e.getName(), e.getSurname(), e.getSalary());
	}
	public static void main(String[] args){
		Employee e1 = new Employee("João", "Silva", 1000);
		Employee e2 = new Employee("Carlos", "Silveira", 1800);
		
		printEmployeeData(e1);
		printEmployeeData(e2);
		
		e1.setSalary(e1.getSalary() * 1.1);
		e2.setSalary(e2.getSalary() * 1.1);
		printEmployeeData(e1);
		printEmployeeData(e2);

	}
}