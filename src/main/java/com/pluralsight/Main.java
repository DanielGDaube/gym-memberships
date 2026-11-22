package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

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

        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(henryClark);
        memberships.add(aliceJohnson);
        memberships.add(bobSmith);
        memberships.add(carolWhite);
        memberships.add(frankMiller);
        memberships.add(graceLee);
        memberships.add(emmaWilson);

        BigDecimal monthlyIncome =BigDecimal.ZERO;
        BigDecimal allContracts = BigDecimal.ZERO;
        for (Membership membership : memberships) {
            System.out.println(membership);
            printCosts(membership);
            monthlyIncome = monthlyIncome.add(membership.getMonthlyPrice());
            allContracts = allContracts.add(membership.getContractTotal());
        }

        System.out.println("--- Totals ---");
        System.out.println("Memberships: " + memberships.size());
        System.out.println("Monthly income: $" + monthlyIncome);
        System.out.println("All contracts: $" + allContracts);

        System.out.println("--- Front Desk Notes ---");
        for (Membership membership : memberships) {
            if (membership instanceof BasicMembership && ((BasicMembership) membership).isOffPeakOnly()){
                System.out.println(membership.getMemberName() + ": entry between 10:00 and 16:00 only");
            }
            if (membership instanceof PremiumMembership){
                ((PremiumMembership) membership).useGuestPass();
            }
            if (membership instanceof FamilyMembership){
                System.out.println(membership.getMemberName() + ": print " +
                        (((FamilyMembership) membership).getExtraMembers() + 1) +
                        " key cards");
            }
        }
    }

    public static void printCosts(Membership membership){
        System.out.println("    Monthly price: $" + membership.getMonthlyPrice() +
                ", sign-up fee: $" + membership.getSignUpFee() +
                ", contract total: $" + membership.getContractTotal());
    }
}
