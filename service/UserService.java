package com.niit.service;

import java.util.List;

import com.niit.model.Users;

public interface UserService {

	public void addUser(Users users);
	public void deleteUser(Users users);
	public Users getUserById(int userId);
	public void editUser(Users user); 
	public List getAllUsers();


}
