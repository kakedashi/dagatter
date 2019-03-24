package jp.co.dagatter.dagatter.mapper;

import jp.co.dagatter.dagatter.domain.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

    List<Users> findAll();

    Users findOne(String id);
}
