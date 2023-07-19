package com.nikhilaukhaj.aemx.models;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;

@MongoEntity(collection = "country")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomCountryModel {
    @BsonProperty("name")
    public String name;
    @BsonProperty("code")
    public String code;
    @BsonProperty("image")
    public String image;
}
