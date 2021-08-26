package com.kenjoel.soso.soso.dto;

import com.kenjoel.soso.soso.models.Customer;
import com.kenjoel.soso.soso.models.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestReceiver {
    private Customer customer;
}
