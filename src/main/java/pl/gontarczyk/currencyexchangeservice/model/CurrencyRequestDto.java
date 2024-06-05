package pl.gontarczyk.currencyexchangeservice.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CurrencyRequestDto {

    private String code;
}