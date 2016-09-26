package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	private int Category_Id;
	private String Category_Name;
	private String Description;
	public int getCategory_Id() {
		return Category_Id;
	}
	public void setCategory_Id(int category_Id) {
		Category_Id = category_Id;
	}
	public String getCategory_Name() {
		return Category_Name;
	}
	public void setCategory_Name(String category_Name) {
		Category_Name = category_Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
