package com.csc;

public class Converter {

  // Convert ounces to pounds 
  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    String formattedPounds = String.format("%.4f", pounds);
    return formattedPounds + (pounds == 1 ? " lb" : " lbs");
  }

  // Convert ounces to pounds and ounces
  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remainingOunces = ounces % 16;
    return (pounds == 1 ? "1 lb" : pounds + " lbs") + 
           (remainingOunces == 1 ? " and 1 ounce" : (remainingOunces > 0 ? " and " + remainingOunces + " ounces" : ""));
  }
}
