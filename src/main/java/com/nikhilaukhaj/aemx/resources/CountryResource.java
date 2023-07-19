package com.nikhilaukhaj.aemx.resources;

import com.nikhilaukhaj.aemx.models.CustomCountryModel;
import com.nikhilaukhaj.aemx.repositories.CountryModelRespository;
import com.nikhilaukhaj.aemx.services.ApiService;
import com.nikhilaukhaj.aemx.services.impl.ApiServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/country")
public class CountryResource {

    @Inject
    ApiService apiService;

    @GET
    public Response getAllCountries(){
        return apiService.getCountries();
    }

    @POST
    public Response addCountry(CustomCountryModel customCountryModel){
        return apiService.addCountry(customCountryModel);
    }

    @PUT
    public Response updateCountry(CustomCountryModel customCountryModel){
        return apiService.updateCountry(customCountryModel);
    }

    @DELETE
    public Response deleteCountry(CustomCountryModel customCountryModel){
        return apiService.deleteCountry(customCountryModel);
    }


}
