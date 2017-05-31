package org.jsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaojianyu on 16/9/2.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {



    @RequestMapping("/listInit")
    @ResponseBody
    public void list(){
    }

    @RequestMapping("/listData")
    public void listData(){
    }

    @RequestMapping("/toAdd")
    public void toAdd(){
    }

    @RequestMapping("/add")
    public void add(){
    }

    @RequestMapping("/toUpdate")
    public void toUpdate(){
    }

    @RequestMapping("/update")
    public void update(){
    }

    @RequestMapping("/delete")
    public void delete(){
    }
}
