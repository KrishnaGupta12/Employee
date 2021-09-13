package com.lt.client;

import com.lt.bean.Customer;
import com.lt.business.CustomerImpl;
import com.lt.business.CustomerInterface;

public class CustomerApp {
    public static void main(String[] args) {

        // we can design the menu of CRS application
        // ex. : student menu,professor menu , admin menu

        Customer customer1= new Customer();
        CustomerInterface customer = new CustomerImpl();

        System.out.println(customer.createCustomer());
        System.out.println(customer.listCustomer());
        System.out.println(customer.updateCustomer(customer1));
        System.out.println(customer.deleteCustomer(100));

    }
}
