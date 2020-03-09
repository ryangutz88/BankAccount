package com.company;

public class SpecialCheckingAccount extends CheckingAccount{
    private double interestRate;
    private double minimumBalance;

    public SpecialCheckingAccount(int idNumber, double startBalance, double cc, double ir, double minBal){
        super(idNumber, startBalance, cc);
        interestRate = ir;
        minimumBalance = minBal;
    }

    public void clearCheck(double amount) {
        if(currentBalance() > minimumBalance){
            decreaseBalance(amount);
        } else {
            super.clearCheck(amount);
        }
    }
    public double monthlyInterest(){
        if(currentBalance() > minimumBalance){
            return currentBalance()*interestRate/12;
        } else {
            return super.monthlyInterest();
        }
    }
}
