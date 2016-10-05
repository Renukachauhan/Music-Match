package com.niit.dao;

import java.util.List;

import com.niit.model.Authority;
import com.niit.model.Suppliers;

public interface SupplierDAO {
	public void addSupplier(Suppliers supplier);
	public void deleteSupplier(Suppliers supplier);
	public Suppliers getSupplierById(int sid);
	public void editSupplier(Suppliers supplier); 
	public List getAllSupplier();
}
