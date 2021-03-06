package cogent.tutorial.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "employee")
public class Employee {
	
	//@Id
	//@Column(name = "EMP_ID")
	private int id;
	
	//@Column(name = "EMP_NAME")
	private String name;
	
	//@Column(name = "SALARY")
	private double salary;
	
	//@ManyToOne
	//@JoinColumn(name = "DEPT_ID", nullable = true, updatable = true)
	//private Department dept;
	
	private int deptId;
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Employee() {}
	
	public Employee(int id, String name, double salary, int deptId) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
	
	
}
