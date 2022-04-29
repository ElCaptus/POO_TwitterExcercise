package ar.edu.unlp.info.oo2.practica1_ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<User> users;
	
	public Twitter() {
		this.users = new ArrayList<User>();
	}
	
	public User signUp(String screenName) {		
		if(this.screenNameAvailable(screenName)) {
			User newUser = new User(screenName);
			users.add(newUser);
			return newUser;
		}
		return null;
	}
	
	public boolean screenNameAvailable (String screenName) {
		if (screenName.length() > 0) {
			if (!users.stream().anyMatch(user -> user.getScreenName() == screenName)) {
				return true;
			}
		}
		return false;
	}
	
	public void delete(String screenName) {
		User userCatched = users.stream().filter( user -> user.getScreenName() == screenName).findFirst().orElse(null);
		this.delete(userCatched);
	}
	
	public void delete(User user) {
		if(user != null) {
			user.delete();
			users.remove(user);
		}
	}
	
	
	public void removeAllUsers() {
		users.forEach(user -> this.delete(user));
	}
	
}
