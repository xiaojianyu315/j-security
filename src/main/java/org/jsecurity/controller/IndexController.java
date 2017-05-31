package org.jsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaojianyu on 16/9/2.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println(1234);
        return "home/index";
    }



}
