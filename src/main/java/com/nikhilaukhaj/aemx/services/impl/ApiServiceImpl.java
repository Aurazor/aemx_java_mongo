package com.nikhilaukhaj.aemx.services.impl;

import com.nikhilaukhaj.aemx.models.CustomCountryModel;
import com.nikhilaukhaj.aemx.repositories.CountryModelRespository;
import com.nikhilaukhaj.aemx.services.ApiService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import java.util.List;

@ApplicationScoped
public class ApiServiceImpl implements ApiService {

    @Inject
    CountryModelRespository countryModelRespository;


    @Override
    public Response getCountries() {
        return getResponse();
    }


    @Override
    public Response addCountry(CustomCountryModel customCountryModel) {
         countryModelRespository.persist(customCountryModel);
         return getResponse();
    }

    @Override
    public Response updateCountry(CustomCountryModel customCountryModel) {
        countryModelRespository.update(customCountryModel);
        return getResponse();
    }

    @Override
    public Response deleteCountry(CustomCountryModel customCountryModel) {
        countryModelRespository.delete(customCountryModel);
        return getResponse();
    }

    @Override
    public Response getResponse() {
        List<CustomCountryModel> countries = getAllCountries();
        return Response.ok().entity(countries).build();
    }

    public List<CustomCountryModel> getAllCountries(){
        return countryModelRespository.listAll();
    }
}
