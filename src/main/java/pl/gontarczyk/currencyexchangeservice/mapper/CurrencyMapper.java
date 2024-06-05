package pl.gontarczyk.currencyexchangeservice.mapper;

import org.mapstruct.Mapper;
import pl.gontarczyk.currencyexchangeservice.model.Currency;
import pl.gontarczyk.currencyexchangeservice.model.CurrencyDto;

@Mapper
public interface CurrencyMapper {

    CurrencyDto toDto(Currency currency);
}