package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FamilyMembership extends Membership{

    private int extraMembers;

    public FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {return extraMembers;}

    public FamilyMembership setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
        return this;
    }

    @Override
    public BigDecimal getMonthlyPrice(){
        BigDecimal monthlyPrice = getBaseRate();
        monthlyPrice = monthlyPrice.add(BigDecimal.valueOf(12.50 * extraMembers));
        if (extraMembers >= 3){
            monthlyPrice = monthlyPrice.multiply(BigDecimal.valueOf(.9));
        }
        monthlyPrice = monthlyPrice.setScale(2, RoundingMode.HALF_UP);
        return  monthlyPrice;
    }

    @Override
    public String toString() {
        return "Family " + getMemberName() + " " + getMonths() + " months " + "extra members: " + extraMembers;
    }
}
