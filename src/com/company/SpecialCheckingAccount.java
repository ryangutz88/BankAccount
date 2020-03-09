package com.company;

public class SpecialCheckingAccount extends CheckingAccount{
    private double interestRate;
    private double minimumInterest;

    public SpecialCheckingAccount(int idNumber, double startBalance, double cc, double ir, double minBal){
        super(idNumber, startBalance, cc);
        interestRate = ir;
        minimumInterest = minBal;
    }

    @Override
    public void clearCheck(double amount) {
        super.clearCheck(amount);
    }
}
