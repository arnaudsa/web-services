package com.estudos.ws.country.service;

import com.estudos.ws.country.model.CountryResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class CountryService {

    private static final Map<String, CountryResponse> PAISES = new HashMap<>();

    static {
        CountryResponse inglaterra = new CountryResponse(5598000L, "Londres", "Libra esterlina");
        CountryResponse brasil = new CountryResponse(21400000L, "Brasília", "Real");
        CountryResponse italia = new CountryResponse(5911000L, "Roma", "Lira italiana");
        CountryResponse holanda = new CountryResponse(1753000L, "Amsterdã", "Euro");
        CountryResponse argentina = new CountryResponse(4581000L, "Buenos Aires", "Peso Argentino");

        PAISES.put("UK", inglaterra);
        PAISES.put("BR", brasil);
        PAISES.put("IT", italia);
        PAISES.put("NL", holanda);
        PAISES.put("AR", argentina);
    }

    public CountryResponse getCountry(String sigla) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1L);
        return Optional.ofNullable(PAISES.get(sigla))
                .orElseThrow( () -> new IllegalArgumentException("País não encontrado."));
    }

}
