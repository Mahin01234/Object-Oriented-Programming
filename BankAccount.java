package com.mycompany.lab_report_1 ; 


import java.util.Scanner  ; 


public class BankAccount
{

    String Account_Number ; 
    long Balance ; 
    
    
    
    public BankAccount (String Account_Number , long Balance) 
    {
        
        
        this.Account_Number = Account_Number ; 
        this.Balance = Balance ; 
    }
    
    
    
    
    
    // Deposit
    public void deposit ( long Amount) 
    {
        if (Amount > 0 ) 
        {
            Balance += Amount ; 
            
            System.out.println ("Deposited is : " +Amount)   ;
        }
        
        else 
        {
            System.out.println ("Deposit amount must be positive.") ;
        }
    } 
    
    
    
    
    
    
    
    
    // Withdraw 
    public void withdraw (double Amount) 
    {
        if ( Amount > 0 && Amount <= Balance ) 
        {
            Balance -= Amount ; 
            System.out.println ("Withdrawn is : " +Amount) ; 
        }
        
        else if (Amount > Balance) 
        {
            System.out.println ("Insufficient Balance.") ; 
        }
        else 
        {
            System.out.println ("Withdraw amount must be positive." ) ; 
        }
    }
    
    
    
    
    
    // Display 
    public void display() 
    {
        System.out.println ("Enter the Account Number is : " + Account_Number )   ; 
        
        
        System.out.println ("Enter the Current Balance is : " + Balance ) ;
        
       
    }
    
    
    
    public static void main (String[] args) 
    {
        
        Scanner s1 = new Scanner (System.in ) ; 
        
        
        
        System.out.println("Enter the Account Number is : " ) ; 
        
        
        String account_number = s1.nextLine() ; 
        
        
        System.out.println ("Enter the Initial Balance is : ") ; 
        
        long initBalance = s1.nextLong() ; 
        
        
        
        BankAccount Account = new BankAccount (account_number , initBalance ) ; 
        
        
        
        System.out.println ("Initial Account Details is : ") ; 
        
        
        Account.display() ; 
        
        
        
        System.out.print("\nEnter the Deposit Amount is : ") ;
        long depositAmount = s1.nextLong() ;
        Account.deposit(depositAmount) ; 
        
        
        
        System.out.print("Enter the Withdraw Amount is : ") ;
        long withdrawAmount = s1.nextLong() ;
        Account.withdraw(withdrawAmount) ; 
        
        
        
        System.out.println("\nUpdated Account Details:") ;
        Account.display() ;

        s1.close() ;

    }
        
}
