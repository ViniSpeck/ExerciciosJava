public class EmployeeTest {
	public static void main(String[] args){
		Employee e = new Employee("João", "Silva", 1000);
		Employee e2 = new Employee("Carlos", "Silveira", 1800);
		Employee e3 = new Employee("Pedro", "Andrade", -100);
		
		System.out.printf("Nome: %s %s, Salário: %.2f\n", e.getName(), e.getSurname(), e.getSalary());
		System.out.printf("Nome: %s %s, Salário: %.2f\n", e2.getName(), e2.getSurname(), e2.getSalary());
		System.out.printf("Nome: %s %s, Salário: %.2f\n", e3.getName(), e3.getSurname(), e3.getSalary());
		
		System.out.printf("Nome: %s %s, Salário com aumento: %.2f\n", e.getName(), e.getSurname(), e.getSalaryIncrease());
		System.out.printf("Nome: %s %s, Salário com aumento: %.2f\n", e2.getName(), e2.getSurname(), e2.getSalaryIncrease());
		System.out.printf("Nome: %s %s, Salário com aumento: %.2f\n", e3.getName(), e3.getSurname(), e3.getSalaryIncrease());
	}
}