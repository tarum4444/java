package com.cybertek.calculator;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;

@Component
public class Calculator {

    private Carpet carpet;

    private Floor floor;

    @Autowired
    public Calculator(@Qualifier("carpetVA") Carpet carpet,
                      @Qualifier("kitchen") Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public String getTotalCarpetCost(City city) throws Exception {
        BigDecimal cost=carpet.getSqFtprice(city).multiply(floor.getArea());

        if(cost.compareTo(BigDecimal.ZERO)==0){
            throw new Exception("This city does not exist");
        }

        return "Total Cost for Carpet :" + cost;
    }
}
