package jp.co.dagatter.dagatter.model;

public class Tweets {
    private Integer id;
    private String tweet;
    private Integer likeCount;
    private Integer retweetCount;
    private String userId;
    private Users user;

    public Tweets(Integer id, String tweet, Integer likeCount, Integer retweetCount, String userId) {
        setId(id);
        setTweet(tweet);
        setLikeCount(likeCount);
        setRetweetCount(retweetCount);
        setUserId(userId);
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTweet() {
        return tweet;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Users getUser() {return user;}
}
