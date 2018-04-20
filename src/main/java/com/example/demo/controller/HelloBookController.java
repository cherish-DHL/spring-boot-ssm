package com.example.demo.controller;

import com.example.demo.config.BookComponent;
import com.example.demo.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Spring Boot Hello案例
 *
 * Created by bysocket on 26/09/2017.
 */
@RestController
public class HelloBookController {

    @Autowired
    BookProperties bookProperties;

    @Resource
    BookComponent bookComponent;

    //两种方式
//    有时候属性太多了，一个个绑定到属性字段上太累，官方提倡绑定一个对象的bean


    @GetMapping("/book/helloP")
    public String sayHelloP() {
        return "Hello， " + bookProperties.getWriter() + " is writing "
                + bookProperties.getName() + " ！";
    }

    @GetMapping("/book/helloC")
    public String sayHelloC() {
        return "Hello， " + bookComponent.getWriter() + " is writing "
                + bookComponent.getName() + " ！";
    }
    @GetMapping("/book/hello")
    public String sayHello() {
        return "Hello， " +bookProperties.getDescription() + " ！";
    }
}
