package com.bootcoding.discount.utils;

import com.bootcoding.discount.model.Customer;

public class DiscountCalculator
{
    private static final int MIN_count=100;
    public static int getDiscount(Customer customer)
    {
        int orderCount = customer.getOrderCount();
        int visitCount = customer.getVisitCount();
        int discount =calcDiscount(orderCount,visitCount);
        return discount;
    }

    private static int calcDiscount(int orderCount,int visitCount)
    {
        int total = orderCount + visitCount;
            if (total>0 && total<249)
            {
                return 10;
            }
            else if (total>250 && total<499)
            {
                return 25;
            }
            else if (total>500 && total<749)
            {
            return 35;
            }
            else if (total>750 && total<1000)
            {
                return 50;
            }
        return 0;
    }
}
