package com.pluralsight;

import java.math.BigDecimal;

public class CorporateMembership extends Membership{

    private BigDecimal employerShare;

    public CorporateMembership(String memberName, int months, BigDecimal baseRate, BigDecimal employerShare) {
        super(memberName, months, baseRate);
        this.employerShare = employerShare;
    }

    public BigDecimal getEmployerShare() {return employerShare;}

    public CorporateMembership setEmployerShare(BigDecimal employerShare) {
        this.employerShare = employerShare;
        return this;
    }

    @Override
    public BigDecimal getMonthlyPrice(){
        return getBaseRate().subtract(employerShare.multiply(getBaseRate()));
    }

    @Override
    public BigDecimal getSignUpFee(){return BigDecimal.ZERO;}

    @Override
    public String toString() {
        return "Corporate | " + getMemberName() + " | " + getMonths() + " months | " + "employer share: " + employerShare;
    }
}
