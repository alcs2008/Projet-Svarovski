package fr.eni.controllers;

import fr.eni.bll.UserService;
import fr.eni.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userBean")
@RequestMapping("/subscription")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String createUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "subscribe";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("user") User user){
        userService.createNewUser(user);
        return "subscribe";
    }

}
