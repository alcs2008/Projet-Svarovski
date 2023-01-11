package fr.eni.controllers;

import fr.eni.bll.JewelService;
import fr.eni.bo.Jewel;
import fr.eni.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller("jewelBean")
public class JewelController {

    private JewelService jewelService;
    @Autowired
    public JewelController(JewelService jewelService) {
        this.jewelService = jewelService;
    }
    @GetMapping("/jewel")
    public String getBijoux() {
        return "jewel";
    }

    @GetMapping("/addjewel")
    public String getJewel(Model model){
        Jewel jewel = new Jewel();
        model.addAttribute("jewel", jewel);
        return "addjewel";
    }

    @PostMapping("/jewelcreate")
    public String createJewel(@ModelAttribute("jewel") Jewel jewel) {
        jewelService.createNewJewel(jewel);
        return "jewel";
    }

/*    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }*/

    @GetMapping("/ml")
    public String getMl() {
        return "ml";
    }

    @GetMapping("/cgv")
    public String getCgv() {
        return "cgv";
    }

}
