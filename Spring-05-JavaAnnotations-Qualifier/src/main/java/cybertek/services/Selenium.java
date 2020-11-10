package cybertek.services;


import cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {


    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : 13");
    }
}
