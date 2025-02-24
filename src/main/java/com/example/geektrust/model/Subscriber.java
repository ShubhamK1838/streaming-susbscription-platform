package com.example.geektrust.model;

import com.example.geektrust.enums.TopUp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Subscriber {


    private String name;
    private float totalCost;
    private List<Subscription> subscriptions;
    private TopUp topUp;


    public void setTopUp(TopUp topUp) {
        if (subscriptions == null) {

        }
        this.topUp = topUp;
        addCost(topUp.getPrice());
    }

    private void addCost(float cost) {
        totalCost += cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public TopUp getTopUp() {
        return topUp;
    }

    public void addSubscription(Subscription subscription) {
        if (subscription == null)
            subscriptions = new ArrayList();

        subscriptions.add(subscription);
        addCost(subscription.getPrice());
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", totalCost=" + totalCost +
                ", subscriptions=" + subscriptions +
                ", topUp=" + topUp +
                '}';
    }
}