package com.sochy.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class JuiiController {
    @GetMapping
    public List<String> index(){
        return List.of("juii","ot","ss");
    }
    @GetMapping("/ekerk")
    public List<String> index2(){
        return List.of("juii","ot","ss");
    }
}
