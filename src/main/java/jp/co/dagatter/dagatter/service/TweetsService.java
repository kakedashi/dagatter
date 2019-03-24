package jp.co.dagatter.dagatter.service;

import jp.co.dagatter.dagatter.domain.Tweets;
import jp.co.dagatter.dagatter.mapper.TweetsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}