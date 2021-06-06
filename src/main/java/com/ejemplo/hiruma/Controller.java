package com.ejemplo.hiruma;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("v1")
public class Controller {
    
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<String> getList(){
        return Arrays.asList("string_1","string_2","string_3");
    }

}
