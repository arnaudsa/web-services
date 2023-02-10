package com.estudos.ws.country.resource;

import com.estudos.ws.country.CountryResource;
import com.estudos.ws.country.model.Authentication;
import com.estudos.ws.country.model.CountryRequest;
import com.estudos.ws.country.model.CountryResponse;
import com.estudos.ws.country.service.CountryService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.estudos.ws.country.CountryResource")
public class CountryResourceImpl implements CountryResource {
    private final CountryService countryService = new CountryService();

    @Override
    public CountryResponse getDetail(Authentication authentication, CountryRequest countryRequest) throws InterruptedException {
        if (invalidAuthentication(authentication)){
            throw new IllegalArgumentException("Acesso Negado.");
        }

        return countryService.getCountry(countryRequest.getSigla());
    }

    public boolean invalidAuthentication(final Authentication authentication){
        if (authentication == null){
            return true;
        }

        if (authentication.getUsername() == null){
            return true;
        }

        if (authentication.getPassword() == null){
            return  true;
        }

        if (authentication.getPassword().isEmpty()) {
            return true;
        }

        return authentication.getUsername().isEmpty();
    }
}
