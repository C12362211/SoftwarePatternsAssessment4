package ex.com.luke.assessment4.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ex.com.luke.assessment4.dao.UserDao;
import ex.com.luke.assessment4.model.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveUser(User user) {
           
           getSession().merge(user);
    }

    public List<User> listUsers() {

           return getSession().createCriteria(User.class).list();
    }

    public User getUser(Long id) {
           return (User) getSession().get(User.class, id);
    }

    public void deleteUser(Long id) {

    	User user = getUser(id);

           if (null != user) {
                  getSession().delete(user);
           }
    }

    private Session getSession() {
           Session sess = getSessionFactory().getCurrentSession();
           if (sess == null) {
                  sess = getSessionFactory().openSession();
           }
           return sess;
    }

    private SessionFactory getSessionFactory() {
           return sessionFactory;
    }

	@Override
	public void loginUser(User user) {
		// TODO Auto-generated method stub
		
	}
}
