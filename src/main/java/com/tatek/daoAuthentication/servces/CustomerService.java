package com.tatek.daoAuthentication.servces;

import com.tatek.daoAuthentication.entities.Customer;
import com.tatek.daoAuthentication.entities.CustomerSecurityDetails;
import com.tatek.daoAuthentication.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements UserDetailsService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customers = customerRepository.findByEmail(username);
        if (customers.isEmpty())
            throw new UsernameNotFoundException("User details not found for the user: " + username);
        else {
            return new CustomerSecurityDetails(customers.get(0));
        }
    }
}
