package encapsulation;

class Employee {
	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;
	
	public void setemployeeId(String employeeId) {
		this.employeeId=employeeId;
	}
	
	public String getemployeeId() {
		return employeeId;
	}
	
	public void setemployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public String getemployeeName() {
		return employeeName;
	}
	
	public void setsalary(int salary) {
		this.salary=salary;
	}
	
	public int getsalary() {
		return salary;
	}
	public void setjobLevel(int jobLevel) {
		this.jobLevel=jobLevel;
	}
	public int getjobLevel() {
		return jobLevel;
	}
	
	public void calculateSalary() {
		if(this.jobLevel >=4 ) {
			this.bonus=100;
		}
		else {
			this.bonus=50;
		}
		this.salary +=this.bonus;
	}
}
public class Exercise1{
	public static void main(String[] args) {
	Employee obj=new Employee();
	obj.setemployeeId("C101");
	obj.setemployeeName("Steve");
	obj.setsalary(650);
	obj.setjobLevel(4);
	
	obj.calculateSalary();
	System.out.println("Employee Details");
	System.out.println("Employee Id :"+obj.getemployeeId());
	System.out.println("Employee Name :"+obj.getemployeeName());
	System.out.println("Salary :"+obj.getsalary());
	
	
	}	
}
