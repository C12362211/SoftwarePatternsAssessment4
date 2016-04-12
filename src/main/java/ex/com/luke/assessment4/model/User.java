package ex.com.luke.assessment4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String payMethod;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	@Column(nullable = false)
	public String getName() {
		return name;
	}

	@Column(length = 15, nullable = false)
	public String getEmail() {
		return email;
	}

	@Column(length = 10)
	public String getPassword() {
		return password;
	}

	@Column(nullable = false)
	public String getAddress() {
		return address;
	}

	@Column
	public String getPayMethod() {
		return payMethod;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setAuthor(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}


}

