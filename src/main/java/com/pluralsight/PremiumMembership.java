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

    public void useGuestPass(){
        if (guestPasses > 0) {
            this.guestPasses -= 1;
            System.out.println(getMemberName() + " used a guest pass. Passes left: " + guestPasses);
        }
        else {
            System.out.println(getMemberName() + " has no guest passes left.");
        }
    }

    @Override
    public BigDecimal getMonthlyPrice(){
        return super.getBaseRate().add(new BigDecimal("18.50"));
    }
}
