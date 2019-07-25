package org.cay.microservice.cayweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class ViewController {
    @GetMapping("/a")
    public String a() {
        return "views/a";
    }

    @GetMapping("/b")
    public String b() {
        return "views/b";
    }
}
