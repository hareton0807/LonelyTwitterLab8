package ca.ualberta.cs.lonelytwitter.lonelyTweet;

import java.util.Date;

/**
 * Created by caochenlin on 2018/11/3.
 */

public class ImportantLonelyTweet extends Tweet {

    public ImportantLonelyTweet() {
    }

    public ImportantLonelyTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    @Override
    public boolean isValid() {

        return !(getTweetBody().trim().length() == 0 || getTweetBody().trim().length() > 20);


    }

    @Override
    public String getTweetBody() {
        return tweetBody.toUpperCase(); // Return upper case of the tweet body
    }
}
