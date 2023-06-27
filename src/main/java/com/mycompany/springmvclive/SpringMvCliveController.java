package com.mycompany.springmvclive;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author daniel.builes
 */

@Controller
public class SpringMvCliveController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, 
            @RequestParam(name = "Lname", required = false, defaultValue = "World") String Lname , Model model) {
        model.addAttribute("name", name);
        model.addAttribute("Lname", Lname);
        return "greeting";
    }

    @GetMapping("/index")
    public String defaultPage() {
        return "index";
    }

    
    
}
