package ex.com.luke.assessment4.service;

import java.util.List;

import ex.com.luke.assessment4.model.User;


public interface UserService {

    public void saveUser(User user);
    
    public List<User> listUsers();
    public User getUser(Long id);
    public void loginUser(User user);

    public void deleteUser(Long id);

}


