package ca.ualberta.cs.lonelytwitter.lonelyTweet;

import java.util.Date;

public class NormalLonelyTweet extends Tweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {

		return !(getTweetBody().trim().length() == 0 || getTweetBody().trim().length() > 20);
	}

	@Override
	public String getTweetBody() {
        return tweetBody; 		// Return normal string from the tweet body
    }
}