package com.example.lab1leo.models;
import java.util.ArrayList;
import com.example.lab1leo.models.OrderConfig;

public class OrderSession {

    private OrderConfig orderConfig;

    public OrderSession(OrderConfig orderConfig) {
        this.orderConfig = orderConfig;
        double priceCafe=5.0;
        double priceTe = 3.0;
        double pricePostre=7.0;

        double hayCafe= orderConfig.getWantCoffe(orderConfig);
        double hayTe = orderConfig.getWantTe(orderConfig);
        double hayPostre = orderConfig.getWantPostre(orderConfig);



        double precioBase=hayPostre*pricePostre+hayCafe*priceCafe+hayTe*priceTe;
        double precioTotal=precioBase*orderConfig.getQuantity(orderConfig)+orderConfig.getExtra(orderConfig)*orderConfig.getNumberAdditionals(orderConfig);

        String nameCustomer=orderConfig.getNameCustomer(orderConfig);
        int numberTable=orderConfig.getNumberTable(orderConfig);
        int quantity=orderConfig.getQuantity(orderConfig);
        int extra=orderConfig.getExtra(orderConfig);
        int numberAdditionals=orderConfig.getNumberAdditionals(orderConfig);

    }
}


