package com.example.geektrust.design1.model;

import com.example.geektrust.design1.SubscriptionPlanAndPrice;
import com.example.geektrust.design1.enums.SubscriptionCategory;
import com.example.geektrust.design1.enums.SubscriptionPlan;

import java.time.LocalDate;

public class MusicStreamSubscription extends Subscription {
    public MusicStreamSubscription(SubscriptionPlan plan, LocalDate startDate) {
        super(SubscriptionCategory.MUSIC, plan, startDate);
    }

}
