package ar.edu.unlp.info.oo2.practica1_ejercicio1;

public class Retweet extends TweetAbs {
	private TweetAbs original;
	
	public Retweet(String content, User user, TweetAbs original) {
		super(content, user);
		this.original = original;
	}
	
	public void delete() {
		super.delete();
		this.original = null;
	}
	
	@Override
	public String toString() {
		String output = String.format("---- <%s>: '%s' \nFrom:", this.user.getScreenName(), this.content);
		if (original != null) {
			output += original.toString();
		}
		return output;
	}
}
