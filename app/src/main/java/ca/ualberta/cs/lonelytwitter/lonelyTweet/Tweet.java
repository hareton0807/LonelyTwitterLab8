package ca.ualberta.cs.lonelytwitter.lonelyTweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by caochenlin on 2018/11/3.
 */

public abstract class Tweet implements Serializable {


    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public abstract String getTweetBody();

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValid();

    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
