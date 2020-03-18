package com.glaysa.movieticket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private final List<Customer> customerList = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Customer customer){
        customerList.add(customer);
    }

    @GetMapping("/hentAlle")
    public List<Customer> hentAlle(){
        return customerList;
    }

    @PostMapping("/del")
    public String deleteCustomers(){
        customerList.clear();
        return "Alle billetter er slettet";
    }
}
