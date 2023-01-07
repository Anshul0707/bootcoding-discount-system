package com.bootcoding.discount.service;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.model.CustomerDiscount;
import com.bootcoding.discount.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscountService
{
    @Autowired
    CustomerService customerService;

    private static final int MAX_LIMIT=100;


    public  List<CustomerDiscount> getAllCustomersDiscount()
    {
        List<CustomerDiscount> customerDiscounts=new ArrayList<>();
        List<Customer>customers=customerService.getAllCustomer();
        for (int i=0; i<customers.size();i++)
        {
            Customer customer=customers.get(i);
            CustomerDiscount customerDiscount= calculateCustomerDiscount(customer);
            customerDiscounts.add(customerDiscount);
        }
        return customerDiscounts;
    }

    private CustomerDiscount calculateCustomerDiscount(Customer customer)
    {
        CustomerDiscount customerDiscount = new CustomerDiscount();
        customerDiscount.setName(NameGenerator.getName());
        customerDiscount.setValidity(DiscountValidityGenerator.getValidity(RandomDateGenerator.getRandomDate()));
        customerDiscount.setDiscount(DiscountCalculator.getDiscount(customer));
        return customerDiscount;
    }

}
