package com.csc;

public class Converter {

    private static final double OUNCES_IN_POUND = 16.0;

    // Converts ounces to pounds and formats the result
    public String toPounds(int ounces) {
        if (ounces < 0) return "Invalid input"; 
        double pounds = ounces / OUNCES_IN_POUND;
        return String.format("%.4f %s", pounds, pounds == 1 ? "lb" : "lbs");
    }

    // Converts ounces to pounds and ounces and formats the result
    public String toPoundsAndOunces(int ounces) {
        if (ounces < 0) return "Invalid input"; 
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        return String.format("%d lb%s %d oz", pounds, pounds == 1 ? "" : "s", remainingOunces);
    }
}
