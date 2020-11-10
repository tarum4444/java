package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    private OfficeHours officeHours;


    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+(30+officeHours.getHours()));
    }
}
