package ex.com.luke.assessment4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ex.com.luke.assessment4.dao.UserDao;
import ex.com.luke.assessment4.model.User;
import ex.com.luke.assessment4.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void saveUser(User user) {
    	userDao.saveUser(user);
    }
    
    @Transactional
    public void loginUser(User user) {
    	userDao.loginUser(user);
    }

    @Transactional( readOnly = true)
    public List<User> listUsers() {
           return userDao.listUsers();
    }

    @Transactional( readOnly = true)
    public User getUser(Long id) {
           return userDao.getUser(id);
    }

    @Transactional
    public void deleteUser(Long id) {
    	userDao.deleteUser(id);

    }
}
