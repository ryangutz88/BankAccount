package com.company;

    public class SavingsAccount extends Account {
        private double annualInterest;

        public SavingsAccount(int idNumber, double startBal, double ai) {
            super(idNumber, startBal);
            annualInterest = ai;
        }

        public double withdraw(double ammount) {
            if(ammount <= currentBalance()){
                super.decreaseBalance(ammount);
            }
        }
        public double monthlyInterest(){
            return (currentBalance() * annualInterest / 12);
        }
    }

