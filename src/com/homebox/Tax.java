package com.homebox;

public class Tax {
    private double grossIncome;
    private int dependents;
    private String state;

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

    public String getState() {
        return state;
    }

    public int getDependents() {
        return dependents;
    }
}
