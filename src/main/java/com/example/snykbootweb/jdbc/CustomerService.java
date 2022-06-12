package com.example.snykbootweb.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    JdbcTemplate jdbcTemplate;

    public CustomerService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int countCustomers() {
        int result = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM CUSTOMERS", Integer.class);

        return result;
    }
}
