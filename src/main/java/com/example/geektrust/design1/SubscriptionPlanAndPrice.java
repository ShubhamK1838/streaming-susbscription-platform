package com.example.geektrust.design1;

import com.example.geektrust.design1.enums.SubscriptionCategory;
import com.example.geektrust.design1.enums.SubscriptionPlan;

public class SubscriptionPlanAndPrice {

    public static final Integer[] musicSubscriptionPlans ;
    public static Integer validity[] = new Integer[SubscriptionPlan.values().length];

    public static Integer getValidity(SubscriptionPlan plan) {
        return validity[plan.ordinal()];
    }

    static {
       musicSubscriptionPlans = new Integer[SubscriptionPlan.values().length];   validity[SubscriptionPlan.FREE.ordinal()] = 1;
        validity[SubscriptionPlan.PERSONAL.ordinal()] = 1;
        validity[SubscriptionPlan.PREMIUM.ordinal()] = 3;;
        validity[SubscriptionPlan.FREE.ordinal()] = 1;
        musicSubscriptionPlans[SubscriptionPlan.FREE.ordinal()]=0;
        musicSubscriptionPlans[SubscriptionPlan.PERSONAL.ordinal()]=100;
        musicSubscriptionPlans[SubscriptionPlan.PREMIUM.ordinal()]=300;
    }
    public static Integer getPrice(SubscriptionCategory category, SubscriptionPlan plan)
    {
            return musicSubscriptionPlans[plan.ordinal()];
    }public static Integer getValidity(SubscriptionCategory category, SubscriptionPlan plan)
    {
            return validity[plan.ordinal()];
    }
}
