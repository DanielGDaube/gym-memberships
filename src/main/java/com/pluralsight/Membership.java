package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public BigDecimal getContractTotal(){
        BigDecimal total = getSignUpFee();
        total = total.add(getMonthlyPrice().multiply(BigDecimal.valueOf(months)));
        total = total.setScale(2, RoundingMode.HALF_UP);
        return total;
    }

    public BigDecimal getMonthlyPrice(){
        return baseRate;
    }

    @Override
    public String toString() {
        return "Membership | " + memberName + " | " + months + " months";
    }
}
