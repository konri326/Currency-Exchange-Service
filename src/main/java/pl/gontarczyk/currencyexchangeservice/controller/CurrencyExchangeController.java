package pl.gontarczyk.currencyexchangeservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.gontarczyk.currencyexchangeservice.mapper.CurrencyMapper;
import pl.gontarczyk.currencyexchangeservice.model.CurrencyDto;
import pl.gontarczyk.currencyexchangeservice.model.CurrencyRequestDto;
import pl.gontarczyk.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
@RequestMapping("/api/v1/currencies")
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final CurrencyExchangeService currencyExchangeService;
    private final CurrencyMapper currencyMapper;

    @GetMapping
    public ResponseEntity<Page<CurrencyDto>> getCurrencies(
            @RequestParam(value = "size", required = false, defaultValue = "10") int size,
            @RequestParam(value = "page", required = false, defaultValue = "0") int page
    ) {
        Page<CurrencyDto> returnedCurrencies = new PageImpl<>(currencyExchangeService.findAll(PageRequest.of(page, size)).stream()
                .map(currencyMapper::toDto)
                .toList());
        return new ResponseEntity<>(returnedCurrencies, HttpStatus.OK);
    }

    @GetMapping("/exact")
    public ResponseEntity<CurrencyDto> getCurrency(@RequestBody CurrencyRequestDto currencyRequestDto) {
        CurrencyDto returnedCurrency = currencyMapper.toDto(currencyExchangeService.findById(currencyRequestDto.getCode()));
        return new ResponseEntity<>(returnedCurrency, HttpStatus.OK);
    }
}