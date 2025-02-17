package com.example.geektrust.design1.model;


import com.example.geektrust.design1.enums.SubscriptionCategory;
import com.example.geektrust.design1.enums.SubscriptionPlan;

import java.time.LocalDate;

public abstract class Subscription {


    private Integer price;
    private LocalDate startDate, endDate, renewalDate;
    private SubscriptionCategory subscriptionCategory;
    private SubscriptionPlan subscriptionPlan;

    public Subscription(SubscriptionCategory category, SubscriptionPlan plan, LocalDate startDate) {
        subscriptionCategory = category;
        subscriptionPlan = plan;
        this.startDate = startDate;
        endDate = startDate.plusMonths(1);
        renewalDate = endDate.minusDays(10);


    }

}