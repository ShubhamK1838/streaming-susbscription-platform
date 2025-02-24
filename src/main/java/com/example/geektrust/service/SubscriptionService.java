package com.example.geektrust.service;


import com.example.geektrust.enums.SubscriptionCategory;
import com.example.geektrust.enums.SubscriptionPlan;
import com.example.geektrust.model.Subscription;

import java.time.LocalDate;

public interface SubscriptionService {

    void startSubscription(LocalDate startDate);

    void addSubscription(SubscriptionCategory subscriptionCategory, SubscriptionPlan subscriptionPlan);

    void printRenewalDetails();

    void addTopup();

}
