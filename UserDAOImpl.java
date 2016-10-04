package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDAO;
import com.niit.model.Users;
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(Users users) {
		
		sessionFactory.getCurrentSession().save(users);
	}

	

	public void deleteUser(Users users) {
		sessionFactory.getCurrentSession().delete(users);
	}



	public Users getUserById(int userId) {

	return	(Users) sessionFactory.getCurrentSession().get(Users.class, userId);
	}



	public void editUser(Users user) {
sessionFactory.getCurrentSession().update(user);		
	}



	public List getAllUsers() {
	return	sessionFactory.getCurrentSession().createQuery("from Users").list();
		
	}

}
