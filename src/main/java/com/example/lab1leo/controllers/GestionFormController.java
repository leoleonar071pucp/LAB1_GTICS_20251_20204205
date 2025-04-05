package com.example.lab1leo.controllers;

import com.example.lab1leo.models.OrderConfig;
import com.example.lab1leo.models.OrderSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GestionFormController {

    @GetMapping("/FormOrder")
    public String showForm(Model model,
                           @RequestParam("nameCustomer") String nameCustomer,
                           @RequestParam("numberTable") int numberTable,
                           @RequestParam("wantCoffe") boolean wantCoffe,
                           @RequestParam("wantTe") boolean wantTe,
                           @RequestParam("wantPostre") boolean wantPostre,
                           @RequestParam("numberAdditionals") boolean numberAdditionals,
                           @RequestParam("quantity") int quantity,
                           @RequestParam("extra") int extra)
    {
        OrderConfig orderConfig = new OrderConfig(nameCustomer,numberTable,wantCoffe,wantTe,wantPostre,numberTable,quantity,extra);
        OrderSession orderSession = new OrderSession(orderConfig);

        model.addAttribute("orderSession", orderSession);
        return "/SummaryOrder";




    }
}
