package com.springframework.rest.example.controllers;

import com.springframework.rest.example.services.ApiService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

@Slf4j
@Controller
@AllArgsConstructor
@NoArgsConstructor
public class UserController {

    @Autowired
    private ApiService apiService;

    @GetMapping({"", "/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange){
        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();

        String nrOfUsers = map.get("limit").get(0);

        Integer limit = 10;

        if(!nrOfUsers.isEmpty() && nrOfUsers.matches("^[1-9]\\d*$")){
            limit = Integer.valueOf(nrOfUsers);
            log.debug("Received Limit value: " + limit);
        }else {
            log.debug("Setting limit to default of 10");
        }

        model.addAttribute("results", apiService.getUsers(limit));

        return "userList";
    }
}
