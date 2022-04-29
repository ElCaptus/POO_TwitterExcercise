package ar.edu.unlp.info.oo2.practica1_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweetTest {
	
	User seba;
	User marcos;
	
	@BeforeEach
	void setUp() throws Exception {
		seba = new User("Sebastian");
		marcos = new User("Marcos");
		
	}
    @Test
    public void createTweets() {
    	Tweet primerTweet = seba.post("oa");
        assertEquals(primerTweet.getContent(), "oa");
        try {
        	@SuppressWarnings("unused")
			Tweet asdf = new Tweet(
        			"asdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadasdfkjhbdnsgvikjsandgovijusadaasdngvikdsugjnmisadug", 
        			marcos);
        }catch(IllegalArgumentException e){
        	assertEquals(e.getMessage(),"Tweets must have 140 or less characters.");
        }
        try {
        	@SuppressWarnings("unused")
			Tweet asdf = new Tweet("Try", marcos);
        }catch(IllegalArgumentException e){
        	assertEquals(e.getMessage(),"Tweets must have a valid owner.");
        }        
    }
}
