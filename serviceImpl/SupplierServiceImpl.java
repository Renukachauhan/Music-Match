package com.niit.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDAO;
import com.niit.model.Suppliers;
import com.niit.service.SupplierService;
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
@Autowired
private SupplierDAO supplierDAO;

@Override
public void addSupplier(Suppliers supplier) {
	supplierDAO.addSupplier(supplier);	
}

@Override
public void deleteSupplier(Suppliers supplier) {
	supplierDAO.deleteSupplier(supplier);	
}

@Override
public Suppliers getSupplierById(int sid) {
return	supplierDAO.getSupplierById(sid);
}

@Override
public void editSupplier(Suppliers supplier) {
	supplierDAO.editSupplier(supplier);	
}

@Override
public List getAllSupplier() {
	return supplierDAO.getAllSupplier();
}
	
}
