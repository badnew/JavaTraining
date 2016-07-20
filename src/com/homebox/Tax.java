package com.homebox;

public class Tax {
    double grossIncome;
    int dependents;
    String state;

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double calcTax() {
        if (grossIncome < 30000) {
            return grossIncome * 0.05;
        } else {
            return grossIncome * 0.06;
        }
    }
}
