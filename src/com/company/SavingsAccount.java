package com.company;

    public class SavingsAccount extends Account {
        private double annualInterest;

        public SavingsAccount(int idNumber, double startBal, double ai) {
            super(idNumber, startBal);
            annualInterest = ai;
        }

        public double Withdraw(double ammount) {
            if(currentBalance() => ammount){
                decreaseBalance();
            }
        }
        public 
    }

