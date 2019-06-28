package com.springboot.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootQuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        int i= 104;
        System.out.println("HelloWorld");
        return "Hello,Springboot";
    }

}
