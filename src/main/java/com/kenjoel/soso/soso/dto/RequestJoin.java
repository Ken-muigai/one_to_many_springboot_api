package com.kenjoel.soso.soso.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestJoin {
    private String name;
    private String productName;
    private String price;

    public RequestJoin(String name, String productName, String price) {
        this.price = price;
        this.name = name;
        this.productName = productName;
    }
}
