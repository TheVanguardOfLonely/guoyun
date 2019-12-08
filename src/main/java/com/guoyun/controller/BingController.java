package com.guoyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GY
 * @site
 * @company
 * @create 2019/12/7 14:40
 */
@Controller
public class BingController {
    @RequestMapping("bing.json")
    public String bing(){
        return "success";
    }
}
