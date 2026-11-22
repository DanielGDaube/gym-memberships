package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership{
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean isOffPeakOnly() {return offPeakOnly;}

    public BasicMembership setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
        return this;
    }

    @Override
    public BigDecimal getMonthlyPrice(){
        BigDecimal monthlyPrice = super.getBaseRate();
        if (offPeakOnly){
            monthlyPrice = monthlyPrice.subtract(new BigDecimal("5.00"));
        }
        return monthlyPrice;
    }

    @Override
    public String toString() {
        return "Basic | " + getMemberName() + " | " + getMonths() + " months | " + "off-peak only: " + offPeakOnly;
    }
}
