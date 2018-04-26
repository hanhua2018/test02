package hh.mywork.service;

import hh.mywork.entity.UserInfoEntity;

import java.util.List;

public interface UserDao {
    public List<UserInfoEntity> findAll();
    public void add(UserInfoEntity userInfoEntity);
}
