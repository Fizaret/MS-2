package az.ingress.ms2.controller;

import az.ingress.ms2.Service.HelloServiceImpl;
import az.ingress.ms2.dto.XDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/hello")
@RestController
public class Xcontroller {
    private final HelloServiceImpl service;
    @GetMapping("/1")
    public XDto sayHello1(String language){

        return service.sayHello1("AZE");
    }
    @GetMapping("/2")
    public XDto sayHello2(){

        return service.sayHello2();
    }
    @GetMapping("/3")
    public XDto sayHello3(){

        return service.sayHello3();
    }

}
