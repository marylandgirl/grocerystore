package com.example.grocerystore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.HashMap;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String deptName;


    @NotNull
    private double price;

    @NotNull
    private String item;

    private HashMap<String,Double> deptSums = new HashMap<String, Double>();

    private HashMap<String,Integer> deptQuantities = new HashMap<String, Integer>();


    public Store() {
        initializeMaps();
    }

    private void initializeMaps() {
        deptSums.put("Cosmetics",0.0);
        deptQuantities.put("Cosmetics",0);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public HashMap<String, Double> getDeptSums() {
        return deptSums;
    }

    public void setDeptSums(HashMap<String, Double> deptSums) {
        this.deptSums = deptSums;
    }

    public HashMap<String, Integer> getDeptQuantities() {
        return deptQuantities;
    }

    public void setDeptQuantities(HashMap<String, Integer> deptQuantities) {
        this.deptQuantities = deptQuantities;
    }

    public void updateSum(String dept, Double price) {

    }
}
