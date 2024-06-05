package pl.gontarczyk.currencyexchangeservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.gontarczyk.currencyexchangeservice.mapper.CurrencyMapper;
import pl.gontarczyk.currencyexchangeservice.mapper.CurrencyMapperImpl;

@Configuration
public class MapStructConfiguration {

    @Bean
    public CurrencyMapper currencyMapper() {
        return new CurrencyMapperImpl();
    }
}