package com.niit.service;

import java.util.List;

import com.niit.model.Suppliers;

public interface SupplierService {
	public void addSupplier(Suppliers supplier);
	public void deleteSupplier(Suppliers supplier);
	public Suppliers getSupplierById(int sid);
	public void editSupplier(Suppliers supplier); 
	public List getAllSupplier();
}
