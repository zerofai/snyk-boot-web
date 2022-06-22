package com.example.snykbootweb.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Customer {
    int id;
    String firstName;
    String lastname;

}
