package ex.com.luke.assessment4.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ex.com.luke.assessment4.model.User;
import ex.com.luke.assessment4.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = { "/", "/listUsers" })
    public String listUsers(Map<String, Object> map) {

           map.put("user", new User());

           map.put("userList", userService.listUsers());

           return "/user/listUsers";
    }

    @RequestMapping("/get/{userId}")
    public String getUser(@PathVariable Long userId, Map<String, Object> map) {

           User user = userService.getUser(userId);

           map.put("user", user);

           return "/user/userForm";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user,
                  BindingResult result) {

           userService.saveUser(user);

           return "redirect:listUsers";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("user") User user,
                  BindingResult result) {

           userService.loginUser(user);

           return "redirect:listUsers";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long id) {

           userService.deleteUser(id);

           return "redirect:/user/listUsers";
    }
}
