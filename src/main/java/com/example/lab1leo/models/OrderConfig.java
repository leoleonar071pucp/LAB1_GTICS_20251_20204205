package com.example.lab1leo.models;

public class OrderConfig {
    private String nameCustomer;
    private int numberTable;


    private boolean wantCoffe;
    private boolean wantTe;
    private boolean wantPostre;


    private int numberAdditionals;
    private int quantity;
    private int extra;
    // si es pequeño 1 , si es grande 2 , si es mas grande 3

    public OrderConfig(String nameCustomer,int numberTable,boolean wantCoffe,boolean wantTe,boolean wantPostre,int numberAdditionals,int quantity,int extra) {
        this.nameCustomer = nameCustomer;
        this.numberTable = numberTable;
        this.wantCoffe = wantCoffe;
        this.wantTe = wantTe;
        this.wantPostre = wantPostre;
        this.numberAdditionals = numberAdditionals;
        this.quantity = quantity;
        this.extra = extra;




    }

    public double getWantCoffe(OrderConfig orderConfig) {
        if (orderConfig.wantCoffe){
            return 1.0;
        }
        else {
            return 0.0;
        }
    }

    public double getWantTe(OrderConfig orderConfig) {
        if (orderConfig.wantTe){
            return 1.0;
        }
        else {
            return 0.0;
        }
    }

    public double getWantPostre(OrderConfig orderConfig) {
        if (orderConfig.wantPostre){
            return 1.0;
        }
        else {
            return 0.0;
        }
    }

    public int getQuantity(OrderConfig orderConfig) {
        return orderConfig.quantity;
    }

    public int getExtra(OrderConfig orderConfig) {
        return orderConfig.extra;
    }

    public int getNumberAdditionals(OrderConfig orderConfig) {
        return orderConfig.numberAdditionals;
    }

    public String getNameCustomer(OrderConfig orderConfig) {
        return orderConfig.nameCustomer;
    }

    public int getNumberTable(OrderConfig orderConfig) {
        return orderConfig.numberTable;
    }
}



