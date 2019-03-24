package jp.co.dagatter.dagatter.domain;

import lombok.*;

@Data
public class Tweets {
    private Integer id;
    private String tweet;
    private Integer likeCount;
    private Integer retweetCount;
    private Integer userId;
}
