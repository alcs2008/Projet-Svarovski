package fr.eni.controllers;

import fr.eni.bll.UserService;
import fr.eni.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller("userBean")
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/subscription")
    public String createUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "subscribe";
    }

    @PostMapping("/subscription")
    public String createUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        //TODO le premier if ne marche pas
        if(bindingResult.hasErrors()){
            return "subscribe";
        } else {
            userService.createNewUser(user);
            return "redirect:/index.html";
        }
    }

    @GetMapping("/login")
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @PostMapping("/login")
    public String connect(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password, HttpSession session){
        User user = userService.connectUser(email, password);
        String retour = null;
        if(user != null){
            System.out.println(email);
            System.out.println(password);
            session.setAttribute("memberLogged", user);
            retour = "redirect:/index.html";
        } else {
            retour = "redirect:/user/login";
        }
        return retour;
    }

}
