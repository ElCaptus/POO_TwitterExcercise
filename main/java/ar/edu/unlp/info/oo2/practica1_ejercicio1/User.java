package ar.edu.unlp.info.oo2.practica1_ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String screenName;
	private List<TweetAbs> tweets;
	
	public User(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<TweetAbs>();
	}
	
	public String getScreenName() { 
		return screenName;
	}

	//Lee un tweet en especifico
	public TweetAbs read(int tweetPos) { 
		if (tweetPos <= tweets.size() && tweetPos > 0){
			return tweets.get(tweetPos-1);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> showAllTweets (){
		List<String> tweetsCatched = (List<String>) tweets.stream().map(tweet -> tweet.toString());
		return new ArrayList<String>(tweetsCatched);
	}
	
	public Tweet post(String content) {
		if (content.length() > 0 || content.length() <=140) {//cambiarlo a TweetAbs
			Tweet newTweet = new Tweet(content, this);
			tweets.add(newTweet);
			return newTweet;
		}
		return null;
	}
	
	public Retweet retweet(String content, TweetAbs tweet) {
		Retweet newTweet = new Retweet(content, this, tweet);
		tweet.retweeted();
		tweets.add(newTweet);
		return newTweet;
	}
	
	public Retweet retweet(TweetAbs tweet) {
		Retweet newTweet = new Retweet("", this, tweet);
		tweet.retweeted();
		tweets.add(newTweet);
		return newTweet;
	}
	
	public void delete () {
		tweets.forEach(tweet -> {tweet.delete();});
		tweets.clear();
		this.screenName = "User Deleted";
	}
	
	@Override
	public String toString() {
		return String.format("screen name: %s",screenName);
	}	
	
}
