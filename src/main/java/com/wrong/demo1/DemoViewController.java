package com.wrong.demo1;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/demoView")
public class DemoViewController {

    @RequestMapping("/pic")
    public String index() {
        return "test_pic";
    }

    @RequestMapping("/prototype")
    public String one() {
        return "prototype";
    }
}
