package com.example.itemservice.dao.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author lukewwang
 * @time 2020/11/22 9:10 PM
 */
@ToString
@Data
@Document(value = "item-coll")
public class Item {

    private String id;
    private int quantity;
    private double ratings;
    private String description;
    private String name;
    private double shippingCosts;

    private boolean isFlagged;
    private List<String> flagUsers = new ArrayList<>();
    private String categoryId;

}
