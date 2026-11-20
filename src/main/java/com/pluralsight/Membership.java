package com.pluralsight;

import java.math.BigDecimal;

public class Membership {
    private String memberName;
    private int months;
    private BigDecimal baseRate;

    public Membership(String memberName, int months, BigDecimal baseRate) {
        this.memberName = memberName;
        this.months = months;
        this.baseRate = baseRate;
    }

    public String getMemberName() {return memberName;}

    public Membership setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    public int getMonths() {return months;}

    public Membership setMonths(int months) {
        this.months = months;
        return this;
    }

    public BigDecimal getBaseRate() {return baseRate;}

    public Membership setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
        return this;
    }

    public BigDecimal getSignUpFee(){
        return new BigDecimal("49.00");
    }

    public BigDecimal getMonthlyPrice(){
        return baseRate;
    }
}
