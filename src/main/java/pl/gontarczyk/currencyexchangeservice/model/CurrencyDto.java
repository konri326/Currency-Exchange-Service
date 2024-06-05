package pl.gontarczyk.currencyexchangeservice.model;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CurrencyDto {

    private int id;
    private String code;
    private String name;
    private BigDecimal purchase;
    private BigDecimal sale;
}