package fr.eni.controllers;

import fr.eni.bll.JewelService;
import fr.eni.bll.JewelTypeService;
import fr.eni.bo.Jewel;
import fr.eni.bo.JewelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller("jewelBean")
@RequestMapping("/jewel")
public class JewelController {

    private JewelService jewelService;
    private JewelTypeService jewelTypeService;

    @Autowired
    public JewelController(JewelService jewelService, JewelTypeService jewelTypeService ) {

        this.jewelService = jewelService;
        this.jewelTypeService = jewelTypeService;
    }

    @ModelAttribute("allType")
    public List<JewelType> typeList() {
        return jewelTypeService.getTypesList();}

    @ModelAttribute("allJewel")
    public List<Jewel> jewelsList() {
        return jewelService.getAllJewel();}

    @GetMapping
    public String getBijoux() {
        return "jewel";
    }

    @GetMapping("/addjewel")
    public String getJewel(Model model){
        Jewel jewel = new Jewel();
        model.addAttribute("jewel", jewel);
        return "addjewel";
    }

    @PostMapping("/addjewel")
    public String createJewel(@ModelAttribute("jewel") Jewel jewel) {
        jewelService.createNewJewel(jewel);
        return "jewel";
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
