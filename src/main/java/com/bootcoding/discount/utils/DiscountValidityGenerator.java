package com.bootcoding.discount.utils;

import java.util.Calendar;
import java.util.Date;

public class DiscountValidityGenerator
{
    public static Date getValidity(int days)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE,days);
        return  c.getTime();
    }
}
