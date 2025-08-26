package com.dataprogramming.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubType {
    private String id;
    private EnumSubType value;

    public enum EnumSubType{
        NORMAL, VIP, PYME
    }
}
