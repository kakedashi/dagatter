package jp.co.dagatter.dagatter.mapper;

import jp.co.dagatter.dagatter.domain.Tweets;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TweetsMapper {

    List<Tweets> findAll();

    Tweets findOne(Long id);

    void save(Tweets player);

    void update(Tweets player);

    void delete(Long id);
}
