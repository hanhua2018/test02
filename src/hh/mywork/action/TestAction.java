package hh.mywork.action;

import com.opensymphony.xwork2.ActionSupport;
import hh.mywork.entity.UserInfoEntity;
import hh.mywork.service.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestAction extends ActionSupport {

   @Autowired
    private UserDaoImpl userDao;
    private UserInfoEntity userInfoEntity;
    private List<UserInfoEntity> userInfoEntityList;
    public String test(){
        System.out.println("a");
        setUserInfoEntityList(userDao.findAll());
        return "test";
    }

    public void setUserDao(UserDaoImpl userDao) {

        this.userDao = userDao;
    }

    public UserInfoEntity getUserInfoEntity() {
        return userInfoEntity;
    }

    public void setUserInfoEntity(UserInfoEntity userInfoEntity) {
        this.userInfoEntity = userInfoEntity;
    }

    public List<UserInfoEntity> getUserInfoEntityList() {
        return userInfoEntityList;
    }

    public void setUserInfoEntityList(List<UserInfoEntity> userInfoEntityList) {
        this.userInfoEntityList = userInfoEntityList;
    }

}
