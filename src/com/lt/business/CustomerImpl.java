package com.lt.business;

import com.lt.bean.Customer;

public class CustomerImpl implements  CustomerInterface{

    Customer customers[] = new Customer[3];

    public String createCustomer(){


        // Implementation later one
        System.out.println("<--- print Customer Details--->");

        // Insert the Customer values in Array.

        // Adding first Customer
        customers[0] = new Customer();
        customers[0].setCustomerId(101);
        customers[0].setCustomerName("Amita");
        customers[0].setCustomerAddress("banglore");


        // Adding first Customer
        customers[1] = new Customer();
        customers[1].setCustomerId(102);
        customers[1].setCustomerName("Anurag");
        customers[1].setCustomerAddress("Hyderabad");


        // Adding first Customer
        customers[2] = new Customer();
        customers[2].setCustomerId(103);
        customers[2].setCustomerName("Anish");
        customers[2].setCustomerAddress("Pune");

        return "create Customer";

    }

    @Override
    public String listCustomer() {

        System.out.println("list customer Impl -->");

        // List Customer Logic
        for(Customer  cust : customers){
            //System.out.println("details of Customer-->" +cust.getCustId() + "" +cust.getCustName()+ "" +cust.getAddress());

            System.out.println("details of Customer--> " +cust.getCustomerId() + "" +cust.getCustomerName()+ "" +cust.getCustomerAddress());
        }

        return "list customer";
    }


    public boolean deleteCustomer(int customerId) {
        return false;
    }

    @Override
    public String updateCustomer(Customer customer) {
        return "update customer";
    }
}
