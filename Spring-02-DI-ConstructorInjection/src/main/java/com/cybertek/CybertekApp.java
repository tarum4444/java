package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

//        Old way to create the object
//        Course course=new Java();
        // casting the old way
       //  Course course= (Course) container.getBean("java");

        // Casting another way
        Course course= container.getBean("java",Course.class);

        course.getTeachingHours();



    }
}
