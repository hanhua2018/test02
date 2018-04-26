package hh.mywork.service;

import hh.mywork.entity.UserInfoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<UserInfoEntity> findAll() {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        Query q=s.createQuery("from UserInfoEntity");
        List<UserInfoEntity> lu=new ArrayList<>();
        lu=q.list();
        tx.commit();
        return lu;
    }

    @Override
    public void add(UserInfoEntity al) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(al);
        tx.commit();
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
