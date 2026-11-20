package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal baseRate = new BigDecimal("30.00");

        System.out.println("=== Gym Memberships ===");

        Membership henryClark = new Membership("Henry Clark",3,baseRate);
        Membership aliceJohnson = new BasicMembership("Alice Johnson",6,baseRate,true);
        Membership bobSmith = new BasicMembership("Bob Smith",2,new BigDecimal("27.50"),false);

        System.out.println("Henry Clark, 3 months, $" + henryClark.getMonthlyPrice() + " per month");
        System.out.println("Alice Johnson, 6 months, $" + aliceJohnson.getMonthlyPrice() + " per month");
        System.out.println("Bob Smith, 2 months, $" + bobSmith.getMonthlyPrice() + " per month");
    }
}
