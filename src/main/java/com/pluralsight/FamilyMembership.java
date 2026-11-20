package com.pluralsight;

import java.math.BigDecimal;

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
}
