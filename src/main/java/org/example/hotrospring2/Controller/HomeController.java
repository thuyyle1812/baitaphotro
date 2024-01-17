package org.example.hotrospring2.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping()
    public String home(){
        return "home";
    }
    @PostMapping("/caculate")
    public String caculator(@RequestParam("number1") double number1,
                            @RequestParam ("number2") double number2,
                            @RequestParam("option")  String option,
                            Model model){
        System.out.println("Number1:"+ number1);
        System.out.println("Number2:"+ number2);
        double result = 0;
        switch (option) {
            case "+":
               result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }

        model.addAttribute("Tong2so", result);
        return "home";
    }



}