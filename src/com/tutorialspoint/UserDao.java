package com.tutorialspoint;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class UserDao {

	User user1 = new User(1, "Wendy Avis", "Teacher");
	ArrayList<User> userList = new ArrayList<User>();

	public UserDao() {
		userList.add(user1);
	}

	public List<User> getAllUsers() {
		return userList;
	}
}