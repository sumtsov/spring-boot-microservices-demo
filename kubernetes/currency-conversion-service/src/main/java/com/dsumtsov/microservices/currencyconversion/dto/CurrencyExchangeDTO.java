package com.dsumtsov.microservices.currencyconversion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchangeDTO {
    private String to;
    private String from;
    private String environment;
    private BigDecimal conversionMultiple;
}
