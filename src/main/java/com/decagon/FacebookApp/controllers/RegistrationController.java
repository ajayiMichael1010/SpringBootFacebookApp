package com.decagon.FacebookApp.controllers;

import com.decagon.FacebookApp.entities.User;
import com.decagon.FacebookApp.pojos.UserSignUpDto;
import com.decagon.FacebookApp.services.UserService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Service
@Data
@RequestMapping("/facebook")
public class RegistrationController {
    private final UserService userService;

    @GetMapping("/register")
    public String getSignupPage(Model model){
        model.addAttribute("userDto", new UserSignUpDto());
        return "register";
    }

    @PostMapping("/register")
    public String postSignUpData(@ModelAttribute UserSignUpDto userDto, Model model){
       // System.out.println(userDto.getFullName());
        User user=userService.registerUser(userDto);

        //model.addAttribute("user",user);
        return "login";
    }

    //@PostMapping("/register")
//    public  boolean registerUser(@ModelAttribute UserSignUpDto userDto, Model model){
//        UserSignUpDto userDto= new UserSignUpDto();
//        userDto.setFullName("AJAYI MICHAEL");
//        userDto.setEmail("olamic695@gmail.com");
//        userDto.setGender("Male");
//        userDto.setUsername("olamic1");
//        userDto.setPassword("12345678");
//
//        return userService.registerUser(userDto);
//    }
}
