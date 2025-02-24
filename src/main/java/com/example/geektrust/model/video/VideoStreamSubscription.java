package com.example.geektrust.model.video;

import com.example.geektrust.enums.SubscriptionCategory;
import com.example.geektrust.enums.SubscriptionPlan;
import com.example.geektrust.model.Subscription;

import java.time.LocalDate;

public class VideoStreamSubscription extends Subscription {

    public VideoStreamSubscription(SubscriptionPlan plan, LocalDate startDate) {
        super(SubscriptionCategory.VIDEO, plan, startDate);
    }
}
