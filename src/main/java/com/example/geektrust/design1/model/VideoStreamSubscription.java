package com.example.geektrust.design1.model;

import com.example.geektrust.design1.enums.SubscriptionCategory;
import com.example.geektrust.design1.enums.SubscriptionPlan;

import java.time.LocalDate;

public class VideoStreamSubscription extends  Subscription{

    public VideoStreamSubscription(SubscriptionPlan plan, LocalDate startDate) {
        super(SubscriptionCategory.VIDEO, plan, startDate);
    }
}
