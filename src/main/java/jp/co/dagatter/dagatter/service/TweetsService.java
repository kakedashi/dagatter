package jp.co.dagatter.dagatter.service;

import jp.co.dagatter.dagatter.domain.Tweets;
import jp.co.dagatter.dagatter.mapper.TweetsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TweetsService {
    @Autowired
    private TweetsMapper tweetsMapper;

    @Transactional
    public List<Tweets> findAll() {
        return tweetsMapper.findAll();
    }

    @Transactional
    public Tweets findOne(Long id) {
        return tweetsMapper.findOne(id);
    }

    @Transactional
    public void save(Tweets tweets) {
        tweetsMapper.save(tweets);
    }

    @Transactional
    public void update(Tweets tweets) {
        tweetsMapper.update(tweets);
    }

    @Transactional
    public void delete(Long id) {
        tweetsMapper.delete(id);
    }

    public List<jp.co.dagatter.dagatter.model.Tweets> convertDomainListToModelList(List<Tweets> TweetsDomainList) {
        List<jp.co.dagatter.dagatter.model.Tweets> tweetsModelList = new ArrayList<jp.co.dagatter.dagatter.model.Tweets>();
        for (Tweets tweetsDomain: TweetsDomainList) {
            tweetsModelList.add(new jp.co.dagatter.dagatter.model.Tweets(
                    tweetsDomain.getId(),
                    tweetsDomain.getTweet(),
                    tweetsDomain.getLike_count(),
                    tweetsDomain.getRetweet_count(),
                    tweetsDomain.getUser_id()));
        }
        return tweetsModelList;
    }

}