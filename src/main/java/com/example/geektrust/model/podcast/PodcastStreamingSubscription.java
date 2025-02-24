package com.example.geektrust.model.podcast;

import com.example.geektrust.enums.SubscriptionCategory;
import com.example.geektrust.enums.SubscriptionPlan;
import com.example.geektrust.model.Subscription;

import java.time.LocalDate;

public class PodcastStreamingSubscription  extends Subscription {
    public PodcastStreamingSubscription(SubscriptionCategory category, SubscriptionPlan plan, LocalDate startDate) {
        super(SubscriptionCategory.PODCAST, plan, startDate);
    }

    @Override
    public String toString() {
        return "PodcastStreamingSubscription{" +
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
