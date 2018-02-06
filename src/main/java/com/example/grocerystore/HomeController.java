package com.example.grocerystore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    CosmeticRepository cosmeticRepository;

    @RequestMapping("/")
    public String listStore(Model model) {
        model.addAttribute("store", storeRepository.findAll());

        return "store";
    }

    @GetMapping("/cosmetics")
    public String shopCosmetics() {
        return "cosmetics";
    }


    @GetMapping("/addcosmetics")
    public String inputCosmetics(Model model){
        model.addAttribute("cosmetic", new Cosmetic());
        return "cosmeticsform";
    }

    @PostMapping("/processcosmetics")
    public String processCosmetics(@Valid @ModelAttribute("cosmetic") Cosmetic cosmetic, BindingResult result){
        if (result.hasErrors()){
            return "/cosmetics";
        }
        cosmeticRepository.save(cosmetic);
        return "redirect:/";
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
