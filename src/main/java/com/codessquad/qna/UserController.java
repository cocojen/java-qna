package com.codessquad.qna;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private static List<User> users = new ArrayList<>();

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("welcome page reload");
        return "welcome";
    }

    @GetMapping("/user/create")
    public String createUser(User user) {
        System.out.println("user : " + user);
        users.add(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "list";
    }
}
