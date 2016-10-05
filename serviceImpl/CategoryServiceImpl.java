package com.niit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
import com.niit.service.CategoryService;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
@Autowired
private CategoryDAO categoryDAO;
	public void addCategory(Category category) {
		categoryDAO.addCategory(category);
		
	}

	public void deleteCategory(Category category) {
		categoryDAO.deleteCategory(category);
		
	}

	

	public void editCategory(Category category) {
		categoryDAO.editCategory(category);
		
	}

	public List getAllCategories() {
	return	categoryDAO.getAllCategories();
	}

	public Category getCategoryById(int cid) {
		return	categoryDAO.getCategoryById(cid);
	}

}
