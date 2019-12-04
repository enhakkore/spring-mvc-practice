package spring.mvc.practice.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
@RequestMapping("/welcome")
public class WelcomeController {

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String welcome(Model model){

        LocalDate today = LocalDate.now();
        String tmp = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        model.addAttribute("today", tmp);
        return "welcome";
    }
}
