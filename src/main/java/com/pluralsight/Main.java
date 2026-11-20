package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym Memberships ===");

        Membership henryClark = new Membership("Henry Clark",3,new BigDecimal("30.00"));

        System.out.println("Henry Clark, 3 months, $30.00 per month");
    }
}
