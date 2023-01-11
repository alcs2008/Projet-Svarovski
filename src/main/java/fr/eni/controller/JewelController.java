package fr.eni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JewelController {

    @GetMapping("/jewel")
    public String getBijoux() {
        return "jewel";
    }

    @GetMapping("/addjewel")
    public String getAddJewel() {
        return "addjewel";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/subscribe")
    public String getSubscribe() {
        return "subscribe";
    }

    @GetMapping("/ml")
    public String getMl() {
        return "ml";
    }

    @GetMapping("/cgv")
    public String getCgv() {
        return "cgv";
    }

}
