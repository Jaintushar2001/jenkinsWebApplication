package com.nagarro.user_data.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.nagarro.user_data.entities.UserData;
import com.nagarro.user_data.repo.UserRepo;

@Controller
public class UserController {
	
	@Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserData());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(UserData user) {
        userRepo.save(user);
        return "redirect:/display";
    }

    @GetMapping("/display")
    public String displayUsers(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "display";
    }
	
	

}
