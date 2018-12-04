package cat.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:HelloSpringboot
 * discription:
 * author:王震涛
 * createTime:2018-12-04 19:51
 */
@RestController
public class HelloSpringboot {

    @RequestMapping("/hello")
    public String test(){
        return "hello spring boot";
    }
}
