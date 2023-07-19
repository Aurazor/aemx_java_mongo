package com.nikhilaukhaj.aemx.services;

import com.nikhilaukhaj.aemx.models.CustomCountryModel;
import jakarta.ws.rs.core.Response;

import java.util.List;

public interface ApiService {
   Response getResponse();
   Response getCountries();
   Response addCountry(CustomCountryModel customCountryModel);
   Response updateCountry(CustomCountryModel customCountryModel);
   Response deleteCountry(CustomCountryModel customCountryModel);
}
