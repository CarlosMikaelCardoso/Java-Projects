package Estudos;

public class Carlator{
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;
    
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan");
        }
        if (downPayment >= carLoan){
            System.out.println("Not enough cash stranger!");
        }
        else if (downPayment <= carLoan){
            System.out.println("The car can be paid in full.");

            int remainBalance = carLoan - downPayment;
            int months = loanLength - 12;
            int monthlyBalance = remainBalance/months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;

            System.out.println(monthlyPayment);
        }


    }
}