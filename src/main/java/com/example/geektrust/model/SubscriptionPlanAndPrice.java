package com.example.geektrust.model;

import com.example.geektrust.enums.SubscriptionCategory;
import com.example.geektrust.enums.SubscriptionPlan;

public class SubscriptionPlanAndPrice {

    public static final Integer[] musicSubscriptionPlans;
    public static Integer validity[] = new Integer[SubscriptionPlan.values().length];
    public static final Integer[] videoPlan = new Integer[SubscriptionPlan.values().length];

    public static Integer getValidity(SubscriptionPlan plan) {
        return validity[plan.ordinal()];
    }

    static {
        musicSubscriptionPlans = new Integer[SubscriptionPlan.values().length];
        validity[SubscriptionPlan.FREE.ordinal()] = 1;
        validity[SubscriptionPlan.PERSONAL.ordinal()] = 1;
        validity[SubscriptionPlan.PREMIUM.ordinal()] = 3;
        ;
        validity[SubscriptionPlan.FREE.ordinal()] = 1;
        musicSubscriptionPlans[SubscriptionPlan.FREE.ordinal()] = 0;
        musicSubscriptionPlans[SubscriptionPlan.PERSONAL.ordinal()] = 100;
        musicSubscriptionPlans[SubscriptionPlan.PREMIUM.ordinal()] = 300;

        videoPlan[SubscriptionPlan.FREE.ordinal()] = 0;
        videoPlan[SubscriptionPlan.PERSONAL.ordinal()] = 200;
        videoPlan[SubscriptionPlan.PREMIUM.ordinal()] = 500;
    }

    public static Integer getPrice(SubscriptionCategory category, SubscriptionPlan plan) {
        if (category.equals(SubscriptionCategory.VIDEO))
            return videoPlan[plan.ordinal()];
        else
            return musicSubscriptionPlans[plan.ordinal()];
    }

    public static Integer getValidity(SubscriptionCategory category, SubscriptionPlan plan) {
        return validity[plan.ordinal()];
    }
}
