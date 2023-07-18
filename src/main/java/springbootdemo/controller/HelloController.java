package springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Xugp
 * @date: 2022/5/16 15:19
 * @description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "hello springboot";
    }
}
