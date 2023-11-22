package com.springFirst.learnspringboot;

import com.springFirst.learnspringboot.dto.Course;
import com.springFirst.learnspringboot.dto.CurrencyServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CurrencyController {
    @Autowired
    private CurrencyServiceConfig config;
    @RequestMapping("/currency")
    public CurrencyServiceConfig retrieveAllCourses(){
        return config;
    }


}
