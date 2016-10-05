package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
@Repository
public class CategoryDAOImpl implements CategoryDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);		
	}

	public void deleteCategory(Category category) {
		sessionFactory.getCurrentSession().delete(category);
		
	}

	

	public void editCategory(Category category) {
		sessionFactory.getCurrentSession().update(category);
		
	}

	public List getAllCategories() {
	return	sessionFactory.getCurrentSession().createQuery("from Category").list();
		}

	public Category getCategoryById(int cid) {

		return	(Category) sessionFactory.getCurrentSession().get(Category.class, cid);
		
	}

}
