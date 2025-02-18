package com.example.geektrust.design1.model;


import com.example.geektrust.design1.SubscriptionPlanAndPrice;
import com.example.geektrust.design1.enums.SubscriptionCategory;
import com.example.geektrust.design1.enums.SubscriptionPlan;

import java.time.LocalDate;

public abstract class Subscription {


    protected Integer price;
    protected LocalDate startDate, endDate, renewalDate;
    protected SubscriptionCategory subscriptionCategory;
    protected SubscriptionPlan subscriptionPlan;
    protected Integer validityInMonth;

    public Subscription(SubscriptionCategory category, SubscriptionPlan plan, LocalDate startDate) {
        subscriptionCategory = category;
        subscriptionPlan = plan;
        this.startDate = startDate;
        endDate = startDate.plusMonths(SubscriptionPlanAndPrice.getValidity(category, plan));
        renewalDate = endDate.minusDays(10);
    }

    public Integer getPrice() {
        return price;
    }


    public LocalDate getStartDate() {
        return startDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public SubscriptionCategory getSubscriptionCategory() {
        return subscriptionCategory;
    }

    public void setSubscriptionCategory(SubscriptionCategory subscriptionCategory) {
        this.subscriptionCategory = subscriptionCategory;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        return subscriptionPlan;
    }


    public Integer getValidityInMonth() {
        return validityInMonth;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public void setValidityInMonth(Integer validityInMonth) {
        this.validityInMonth = validityInMonth;
    }
}