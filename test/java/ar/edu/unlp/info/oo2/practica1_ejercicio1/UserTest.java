package ar.edu.unlp.info.oo2.practica1_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
	
	User marcos;
	User delfi;
	
	@BeforeEach
	void setUp() throws Exception {
		marcos = new User("Marcos");
		delfi = new User("Delfi");
		
	}
	
	@Test
	public void userCreation() {
		assertEquals(new User("Marcos").getScreenName(), "Marcos");
		assertEquals(new User("Seba").getScreenName(), "Seba");
		assertEquals(marcos.getScreenName(), "Marcos");
		assertEquals(delfi.getScreenName(), "Delfi");
	}
	
	@Test
	public void readWriteDeleteTweets() {
		assertEquals(marcos.read(0), null);
		assertEquals(marcos.read(1), null);
		assertEquals(marcos.toString(), "screen name: Marcos");
		assertEquals(delfi.read(1), null);
		Tweet delfiTweet = delfi.post("holas");
		assertEquals(delfi.read(1),delfiTweet);
		Tweet marcosFirstTweet = marcos.post("Primer Tweet.");
		assertEquals(marcos.read(1),marcosFirstTweet);
		Tweet marcosSecondTweet = marcos.post("Segundo Tweet.");
		assertEquals(marcos.read(1),marcosFirstTweet);
		assertEquals(marcos.read(2),marcosSecondTweet);
		marcos.delete();
		delfi.delete();
		assertEquals(delfi.read(1),null);
		assertEquals(marcos.read(1),null);
	}
	
	@Test
	public void retweeting () {
		Tweet marcosFirstTweet = marcos.post("Primer Tweet.");
		Retweet firstRetweet = marcos.retweet("Esto es un retweet de:",marcosFirstTweet);
		assertEquals(firstRetweet, marcos.read(2));
		Retweet delfiRetweetARetweet = delfi.retweet("Eaeaea",firstRetweet);
		assertEquals("---- <Delfi>: 'Eaeaea' \nFrom:---- <Marcos>: 'Esto es un retweet de:' \nFrom:<Marcos>: 'Primer Tweet.'", delfi.read(1).toString());
		assertEquals("---- <Delfi>: '' \nFrom:---- <Marcos>: 'Esto es un retweet de:' \nFrom:<Marcos>: 'Primer Tweet.'", delfi.retweet(firstRetweet).toString());
		assertEquals("---- <Delfi>: 'Eaeaea' \nFrom:---- <Marcos>: 'Esto es un retweet de:' \nFrom:<Marcos>: 'Primer Tweet.'", delfiRetweetARetweet.toString());
		marcos.delete();		
	}
	
}
