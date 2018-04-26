package hh.mywork.util;

import hh.mywork.entity.UserInfoEntity;
import hh.mywork.service.UserDao;
import hh.mywork.service.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.UUID;

public class Test {
    public static void main(String[] arg){
        ApplicationContext ac=new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        TestService ts=(TestService)ac.getBean("testService");
        ts.hello();
        UserDao ud=(UserDaoImpl)ac.getBean("userDao");
        UserInfoEntity ue=new UserInfoEntity();
        ue.setUuid(UUID.randomUUID().toString());
        ue.setUserName("admin");
        ue.setPwd("123456");
        ud.add(ue);
    }
}
