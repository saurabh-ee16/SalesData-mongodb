package com.rest.java.app.app.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.types.ObjectId;

public class SalesData {
    private ObjectId id;

    @JsonProperty(value = "saleDate")
    private Date salesDate;

    @JsonProperty(value = "items")
    private List<Items> items;

    private String storeLocation;

    private Customer customer;

    private boolean couponUsed;
    private String purchaseMethod;

}
