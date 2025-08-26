package com.dataprogramming.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TypeCustomer {
    private String id;
    private EnumTypeCustomer value;
    private SubType subType;

    public enum EnumTypeCustomer {
        BUSINESS, PERSONAL
    }
}
