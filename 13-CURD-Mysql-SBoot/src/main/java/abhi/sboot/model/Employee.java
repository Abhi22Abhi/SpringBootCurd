package abhi.sboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

// ==> LomBok Annotations


//@Setter(value = AccessLevel.PUBLIC)

@Data

// ==> Spring Data JPA Annotations

@Entity
@Table(name="tab_emp")
public class Employee {

	@Id
	
	// @GeneratedValue(strategy = GenerationType.AUTO)
	//From Hibernate-5 => AUTO woon't work,so,use =>  //	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	private String name;
	
	private int age;
	
	private String department;
		
	private int salary;
	
	@CreationTimestamp
	@Column(name = "create_at", nullable = false, updatable = false)
	private Date createAt;
	
	@UpdateTimestamp
	@Column(name = "update_at")
	private Date updateAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Employee(Long id, String name, int age, String department, int salary, Date createAt, Date updateAt) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Employee() {
		super();
	}
	
	
	
}
