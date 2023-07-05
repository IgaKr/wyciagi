package com.wyciagi.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pierwszyController {


    @RequestMapping("/")
    public String index() {
        return "Nasz pierwszy projekt i już działający serwer :-)";
    }
}
