package ex.com.luke.assessment4.dao;

import java.util.List;

import ex.com.luke.assessment4.model.User;

public interface UserDao {

    public void saveUser(User user); // create and update

    public List<User> listUsers();
    public User getUser(Long id);
    public void loginUser(User user);
    
    public void deleteUser(Long id);
}
