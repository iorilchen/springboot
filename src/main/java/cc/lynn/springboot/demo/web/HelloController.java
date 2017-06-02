package cc.lynn.springboot.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lynn on 2017/6/2.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
}
