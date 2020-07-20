package com.github.Pogryziony.TimeTracker.Controller;
//W kontrolerze strony głównej powinniśmy ustawić jako atrybut modelu nowy obiekt reprezentujący czas, który będzie później zbindowany z formularzem.


import com.github.Pogryziony.TimeTracker.Model.TimeData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String home(Model model){
        model.addAttribute("timeData", new TimeData());

        return "index";
    }

}
