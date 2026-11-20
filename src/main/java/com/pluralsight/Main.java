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

        System.out.println(henryClark.getMemberName() + ", " + henryClark.getMonths() + " " + "months, $" + henryClark.getMonthlyPrice() + " per month");
        System.out.println(aliceJohnson.getMemberName() + ", " + aliceJohnson.getMonths() + " " + "months, $" + aliceJohnson.getMonthlyPrice() + " per month");
        System.out.println(bobSmith.getMemberName() + ", " + bobSmith.getMonths() + " " + "months, $" + bobSmith.getMonthlyPrice() + " per month");
        System.out.println(carolWhite.getMemberName() + ", " + carolWhite.getMonths() + " " + "months, $" + carolWhite.getMonthlyPrice() + " per month");
        System.out.println(frankMiller.getMemberName() + ", " + frankMiller.getMonths() + " " + "months, $" + frankMiller.getMonthlyPrice() + " per month");
        System.out.println(graceLee.getMemberName() + ", " + graceLee.getMonths() + " " + "months, $" + graceLee.getMonthlyPrice() + " per month");
        System.out.println(emmaWilson.getMemberName() + ", " + emmaWilson.getMonths() + " " + "months, $" + emmaWilson.getMonthlyPrice() + " per month");

        System.out.println("--- Guest passes ---");

        ((PremiumMembership) carolWhite).useGuestPass();
        ((PremiumMembership) carolWhite).useGuestPass();
        ((PremiumMembership) carolWhite).useGuestPass();
        ((PremiumMembership) frankMiller).useGuestPass();
    }
}
