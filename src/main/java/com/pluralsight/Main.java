package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal baseRate = new BigDecimal("30.00");

        System.out.println("=== Gym Memberships ===");

        Membership henryClark = new Membership("Henry Clark",3,baseRate);
        Membership aliceJohnson = new BasicMembership("Alice Johnson",6,baseRate,true);
        Membership bobSmith = new BasicMembership("Bob Smith",2,new BigDecimal("27.50"),false);
        Membership carolWhite = new PremiumMembership("Carol White", 12,baseRate,2);
        Membership frankMiller = new PremiumMembership("Frank Miller",3,baseRate,0);
        Membership graceLee = new FamilyMembership("Grace Lee", 12,baseRate,3);
        Membership emmaWilson = new FamilyMembership("Emma Wilson", 6,baseRate,1);

        System.out.println(henryClark);
        System.out.println(aliceJohnson);
        System.out.println(bobSmith);
        System.out.println(carolWhite);
        System.out.println(frankMiller);
        System.out.println(graceLee);
        System.out.println(emmaWilson);

        System.out.println("--- Guest passes ---");

        ((PremiumMembership) carolWhite).useGuestPass();
        ((PremiumMembership) carolWhite).useGuestPass();
        ((PremiumMembership) carolWhite).useGuestPass();
        ((PremiumMembership) frankMiller).useGuestPass();

        System.out.println("--- Sign-up fee and contract total ---");

        System.out.println(henryClark.getMemberName() + ": fee $" + henryClark.getSignUpFee() + ", total $" + henryClark.getContractTotal());
        System.out.println(carolWhite.getMemberName() + ": fee $" + carolWhite.getSignUpFee() + ", total $" + carolWhite.getContractTotal());
        System.out.println(frankMiller.getMemberName() + ": fee $" + frankMiller.getSignUpFee() + ", total $" + frankMiller.getContractTotal());
        System.out.println(graceLee.getMemberName() + ": fee $" + graceLee.getSignUpFee() + ", total $" + graceLee.getContractTotal());
    }
}
