package Emp;

public class Emp {
	private int Emp_id;
	private String Emp_name;
	private double salary;
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [Emp_id=" + Emp_id + ", Emp_name=" + Emp_name + ", salary=" + salary + "]";
	}
	
	
}
