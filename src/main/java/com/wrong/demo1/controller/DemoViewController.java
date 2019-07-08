package com.wrong.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
@RequestMapping("/mock")
public class DemoViewController {

    @RequestMapping(value = "/index", method = GET)
    public String index() {
        return "mock_index";
    }

    @RequestMapping(value = "/department", method = GET)
    public String department() {
        return "mock_department ";
    }


}
