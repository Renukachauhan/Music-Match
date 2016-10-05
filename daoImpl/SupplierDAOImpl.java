package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.SupplierDAO;

import com.niit.model.Suppliers;
@Repository
public class SupplierDAOImpl implements SupplierDAO{
@Autowired
private SessionFactory sessionFactory;

@Override
public void addSupplier(Suppliers supplier) {
	sessionFactory.getCurrentSession().save(supplier);	
}

@Override
public void deleteSupplier(Suppliers supplier) {
	sessionFactory.getCurrentSession().delete(supplier);	
}

@Override
public Suppliers getSupplierById(int sid) {
	return (Suppliers) sessionFactory.getCurrentSession().get(Suppliers.class, sid);
}

@Override
public void editSupplier(Suppliers supplier) {
	sessionFactory.getCurrentSession().update(supplier);	
}

@Override
public List getAllSupplier() {
return	sessionFactory.getCurrentSession().createQuery("from Suppliers").list();
}

	
}
