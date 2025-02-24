package com.example.geektrust.model.music;

import com.example.geektrust.enums.SubscriptionCategory;
import com.example.geektrust.enums.SubscriptionPlan;
import com.example.geektrust.model.Subscription;

import java.time.LocalDate;

public class MusicStreamSubscription extends Subscription {
    public MusicStreamSubscription(SubscriptionPlan plan, LocalDate startDate) {
        super(SubscriptionCategory.MUSIC, plan, startDate);
    }


    @Override
    public String toString() {
        return "MusicStreamSubscription{" +
                "price=" + price +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", renewalDate=" + renewalDate +
                ", subscriptionCategory=" + subscriptionCategory +
                ", subscriptionPlan=" + subscriptionPlan +
                ", validityInMonth=" + validityInMonth +
                '}';
    }
}
