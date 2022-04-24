package com.rest.java.app.app.repository;

import com.rest.java.app.app.model.SalesData;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository extends MongoRepository<SalesData,ObjectId>{
    
}
