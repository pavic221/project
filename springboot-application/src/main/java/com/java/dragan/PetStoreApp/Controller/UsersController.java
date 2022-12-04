package com.java.dragan.PetStoreApp.Controller;


import com.java.dragan.PetStoreApp.Models.Users;

import com.java.dragan.PetStoreApp.Service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class UsersController {

    private UserService userService;

    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }
    // handler method to handle list students and return mode and view
        @GetMapping("/users")
        public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

         @GetMapping("/users/new")
         public String CreateUsersForm(Model model) {
// create student object to hold student form data
         Users user = new Users();
         model.addAttribute("user" ,user);
         return "create_user";
    }

    @PostMapping("/users")
    public String saveUsers(@ModelAttribute("user") Users user) {
        userService.saveUser(user);
        return "redirect:/users";
    }



}
