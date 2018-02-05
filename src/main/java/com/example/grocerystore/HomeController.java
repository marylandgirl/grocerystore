package com.example.grocerystore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    CosmeticRepository cosmeticRepository;

    @RequestMapping("/")
    public String listStore(Model model) {
//        model.addAttribute("store", storeRepository.findAll());
        return "store";
    }

    @GetMapping("/cosmetics")
    public String shopCosmetics() {
        return "cosmetics";
    }


    @GetMapping("/addcosmetics")
    public String inputCosmetics(){
        return "cosmeticsform";
    }

    @GetMapping("/cleaning")
    public String shopCleaning() {
        return "cleaning";
    }


    @GetMapping("/snacks")
    public String shopSnacks() {
        return "snacks";
    }

}
