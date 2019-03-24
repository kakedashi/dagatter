package jp.co.dagatter.dagatter.domain;

import lombok.*;

@Data
public class Tweets {
    private Integer id;
    private String tweet;
    private Integer like_count;
    private Integer retweet_count;
    private String user_id;
}
