package com.niit.model;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Suppliers {
	@Id
private int SupplierId;
	private String Name;
	private String Address;
	private int Phone_Number;
	private String EMail_Id;
	
	@OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL, fetch =FetchType.EAGER)
	private List<Product> product;

	public int getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(int phone_Number) {
		Phone_Number = phone_Number;
	}

	public String getEMail_Id() {
		return EMail_Id;
	}

	public void setEMail_Id(String eMail_Id) {
		EMail_Id = eMail_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSupplierId() {
		return SupplierId;
	}

	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}

}
