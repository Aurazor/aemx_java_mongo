package com.nikhilaukhaj.aemx.repositories;

import com.nikhilaukhaj.aemx.models.CustomCountryModel;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CountryModelRespository implements PanacheMongoRepository<CustomCountryModel> {

}
