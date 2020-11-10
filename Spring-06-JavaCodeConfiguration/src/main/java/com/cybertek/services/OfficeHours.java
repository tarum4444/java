package com.cybertek.services;

import com.cybertek.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {

    @Override
    public int getExtraHours() {
        return 5;
    }
}
