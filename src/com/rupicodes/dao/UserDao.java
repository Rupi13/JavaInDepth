package com.rupicodes.dao;

import com.rupicodes.DataStore;
import com.rupicodes.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
