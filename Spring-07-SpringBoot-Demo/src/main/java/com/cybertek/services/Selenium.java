package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Override
    public void getHours() {
        System.out.println("Teaching hours for Selenium : 20");
    }
}
