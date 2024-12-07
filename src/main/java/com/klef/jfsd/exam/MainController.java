package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/SpringMVC")
public class MainController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @GetMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "calculateSum";
    }

    @GetMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 + num2);
        return "addNumbers";
    }

    @GetMapping("/combine")
    public String combine(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("combined", str1 + " " + str2);
        return "combine";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("multiplication", num1 * num2);
        return "calculate";
    }
}
