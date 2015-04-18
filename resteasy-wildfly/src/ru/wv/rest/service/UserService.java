package ru.wv.rest.service;

import java.util.ArrayList;
import java.util.List;

import ru.wv.rest.model.User;

public class UserService {
	public List<User> getUsers() {
		List<User> userList = new ArrayList<User>();
		
		User user = new User(0L, "Jan", 28);
		userList.add(user);
		user = new User(0L, "Jan", 28);
		userList.add(user);
		user = new User(1L, "Jiri", 24);
		userList.add(user);
		user = new User(2L, "wyvie", 26);
		userList.add(user);
		user = new User(3L, "irony", 30);
		userList.add(user);
		
		return userList;
	}
}
