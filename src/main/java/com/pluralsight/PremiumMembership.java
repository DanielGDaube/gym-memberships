package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership{

    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    public int getGuestPasses() {return guestPasses;}

    public PremiumMembership setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
        return this;
    }

    @Override
    public BigDecimal getMonthlyPrice(){
        return super.getMonthlyPrice().add(new BigDecimal("18.50"));
    }
}
