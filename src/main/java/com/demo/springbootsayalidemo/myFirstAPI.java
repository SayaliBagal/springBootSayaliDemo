package com.demo.springbootsayalidemo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class myFirstAPI {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }
    @RequestMapping("/first-api")
    public String firstAPI(){
        return "Hello Class";
    }

    @GetMapping("/second-api/{name}")
    public String secondAPI(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("/third-api/{name}/{times}")
    public String thirdAPI(@PathVariable String name, @PathVariable int times){
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<times; i++){
            str.append(name).append(" ").append(i + 1);
            str.append("\n");
        }
        return str.toString();
    }

}
