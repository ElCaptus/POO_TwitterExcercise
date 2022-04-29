package ar.edu.unlp.info.oo2.practica1_ejercicio1;

import java.util.UUID;

public abstract class TweetAbs {
	
	protected String content;
	protected User user;
	protected int retweetAmount;
	protected String id;
	
	public TweetAbs(String content, User user) {
		this.content = content;
		this.user = user;
		this.retweetAmount = 0;
		this.id = UUID.randomUUID().toString();
	}
	
	public String getContent() {
		return content;
	}

	public User getUser() {
		return user;
	}
	
	public int getRetweetAmount() {
		return retweetAmount;
	}
	
	public int retweeted() {
		return ++retweetAmount;
	}
	
	public void delete() {
		this.content = "This tweet has been delete.";
	}
	
	@Override
	public String toString() {
		return String.format("<%s>: '%s'", this.user.getScreenName(), this.content);
	}
}
