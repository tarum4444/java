package com.cybertek.services;

import com.cybertek.interfaces.Course;

import lombok.Data;


@Data

public class Java implements Course {



    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: 20 ");
    }



}
