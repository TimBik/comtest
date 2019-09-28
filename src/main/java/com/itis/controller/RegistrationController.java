package com.itis.controller;


import com.itis.dao.DonatorDao;
import com.itis.dao.UserDao;
import com.itis.models.Donator;
import com.itis.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
@Controller
@RequiredArgsConstructor
public class RegistrationController {
    private final DonatorDao donatorDao;
    private final UserDao userDao;

    @GetMapping(value = "/registration")
    public String registration() {
        return "authpages/registration";
    }

    @PostMapping(value = "/registration")
    public String addUser(User user, Model model) {
        boolean exist = userDao.checkIfUserExist(user.getUsername());
        if (exist) {
            model.addAttribute("message", "User exists");
            return "authpages/registration";
        }
        repositoryWorker.saveUser(user);
        return "redirect:/login";
    }
}*/
