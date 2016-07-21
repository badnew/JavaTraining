package fain.chapter6.tryItSection;

public interface Payable {
    int INCREASE_CAP = 20;          // public static final by default
    boolean incPay(int percent);    // public by default
}
