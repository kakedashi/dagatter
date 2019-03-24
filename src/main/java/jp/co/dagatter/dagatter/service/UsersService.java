package jp.co.dagatter.dagatter.service;

import jp.co.dagatter.dagatter.domain.Users;
import jp.co.dagatter.dagatter.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Transactional
    public List<Users> findAll() {
        return usersMapper.findAll();
    }

    @Transactional
    public Users findOne(String id) {
        return usersMapper.findOne(id);
    }

    public List<jp.co.dagatter.dagatter.model.Users> convertDomainListToModelList(List<Users> UsersDomainList) {
        List<jp.co.dagatter.dagatter.model.Users> usersModelList = new ArrayList<jp.co.dagatter.dagatter.model.Users>();
        for (Users UsersDomain: UsersDomainList) {
            usersModelList.add(new jp.co.dagatter.dagatter.model.Users(UsersDomain.getId(), UsersDomain.getName(), UsersDomain.getImage_url()));
        }
        return usersModelList;
    }

    public jp.co.dagatter.dagatter.model.Users convertDomainToModel(Users UsersDomain) {
        jp.co.dagatter.dagatter.model.Users usersModel = new jp.co.dagatter.dagatter.model.Users(
                UsersDomain.getId(), UsersDomain.getName(), UsersDomain.getImage_url());
        return usersModel;
    }
}