package pl.gontarczyk.currencyexchangeservice.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.gontarczyk.currencyexchangeservice.model.Currency;
import pl.gontarczyk.currencyexchangeservice.repository.CurrencyExchangeRepository;

@Service
@RequiredArgsConstructor
public class CurrencyExchangeService {

    private final CurrencyExchangeRepository currencyExchangeRepository;

    public Page<Currency> findAll(Pageable pageable) {
        return currencyExchangeRepository.findAll(pageable);
    }

    public Currency findById(String code) {
        return currencyExchangeRepository.findByCode(code)
                .orElseThrow(() -> new EntityNotFoundException("Currency not exists in this service."));
    }
}