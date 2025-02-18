package com.example.geektrust.design1.model;

import com.example.geektrust.design1.enums.SubscriptionCategory;
import com.example.geektrust.design1.enums.SubscriptionPlan;

import java.time.LocalDate;

public class PodcastStreamingSubscription  extends  Subscription{
    public PodcastStreamingSubscription(SubscriptionCategory category, SubscriptionPlan plan, LocalDate startDate) {
        super(SubscriptionCategory.PODCAST, plan, startDate);
    }
}
