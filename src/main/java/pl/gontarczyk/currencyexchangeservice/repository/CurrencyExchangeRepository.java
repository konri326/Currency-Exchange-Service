package pl.gontarczyk.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gontarczyk.currencyexchangeservice.model.Currency;

import java.util.Optional;

public interface CurrencyExchangeRepository extends JpaRepository<Currency, Integer> {

    Optional<Currency> findByCode(String code);
}