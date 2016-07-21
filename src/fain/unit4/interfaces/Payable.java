package fain.unit4.interfaces;

public interface Payable {
    int INCREASE_CAP = 20;    // final static by default
    boolean increasePay(int percent);
}