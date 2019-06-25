package com.wrong.demo1;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mock")
public class DemoViewController {

    @RequestMapping("/index")
    public String index() {
        return "mock_index";
    }

    @RequestMapping("/department ")
    public String department() {
        return "mock_department ";
    }


}
