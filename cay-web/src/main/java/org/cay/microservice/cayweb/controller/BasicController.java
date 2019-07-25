package org.cay.microservice.cayweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

    @RequestMapping(value = { "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value={"/","/homepage"})
    public String homepage(){
        return "HomePage";
    }
}
