package Emp;

public class Company {
		private String Comp_name;
		private String Comp_loc;
		private double Comp_salary;
		
	
		public String getComp_name() {
			return Comp_name;
		}
		public void setComp_name(String comp_name) {
			Comp_name = comp_name;
		}
		public String getComp_loc() {
			return Comp_loc;
		}
		public void setComp_loc(String comp_loc) {
			Comp_loc = comp_loc;
		}
		public double getComp_salary() {
			return Comp_salary;
		}
		public void setComp_salary(double comp_salary) {
			Comp_salary = comp_salary;
		}
		
		Emp obj=new Emp();
		
		@Override
		public String toString() {
			return "Comp [Comp_name=" + Comp_name + ", Comp_loc=" + Comp_loc + ", Comp_salary=" + Comp_salary + "]";
		}
		
		
}
