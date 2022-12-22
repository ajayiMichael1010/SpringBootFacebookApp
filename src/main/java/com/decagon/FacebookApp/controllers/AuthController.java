package com.decagon.FacebookApp.controllers;
import com.decagon.FacebookApp.entities.User;
import com.decagon.FacebookApp.pojos.UserLoginDto;
import com.decagon.FacebookApp.services.UserService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@Service
@Data
@RequestMapping("/facebook")

public class AuthController {
    private final UserService userService;

    @GetMapping("/login")
    public  String getLoginPage(Model model, HttpSession session,HttpServletRequest request, HttpServletResponse response) throws IOException {
        model.addAttribute("userLoginDto",new UserLoginDto());
        if(session.getAttribute("user")!=null){
            response.sendRedirect("/facebook/index");
        }
        return "login";
    }

    @PostMapping("/login")
    public String validateUser(@ModelAttribute UserLoginDto userLoginDto, Model model, HttpSession session){
        User user=null;
        user= userService.authenticateUser(userLoginDto);
       if(user.getId()!=null){
           session.setAttribute("user",user);
           return "redirect:/facebook/index";
       }
       else{
           session.setAttribute("errorMessage","Wrong username or password");
           return "redirect:/facebook/login";
       }
    }

    @GetMapping("/logout")
    public  void LogOutUser(Model model, HttpSession session, HttpServletResponse response) throws IOException {
            session.invalidate();
            response.sendRedirect("/facebook/login");
    }
}
