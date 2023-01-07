package com.bootcoding.discount.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CustomerDiscount
{
    public String name;
    public int discount;
    public Date validity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }
}
