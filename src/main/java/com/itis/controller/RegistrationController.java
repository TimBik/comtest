package com.itis.controller;


import com.itis.dao.DonatorDao;
import com.itis.dao.UserDao;
import com.itis.models.Donator;
import com.itis.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/*@Controller
@RequiredArgsConstructor
public class RegistrationController {
    private final UserDao userDao;


    @GetMapping(value = "/registration")
    public String registration(@AuthenticationPrincipal User user) {
        if (user){
            return "/";
        }
        return "";
    }

    @PostMapping(value = "/registration")
    public String addUser(User user, Model model) {
        boolean exist = userDao.checkIfUserExist(user.getUsername());
        if (exist) {
            model.addAttribute("message", "User exists");
            return "";
        }
        UserDao.saveUser(user);
        return "redirect:/login";
    }
}*/
