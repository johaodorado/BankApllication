package bankapplication;

import java.util.Iterator;
import java.util.regex.Pattern;

public class DepositOperation implements BankingOperation_q {

{
    int Depositeflag = 0;
    //Pattern pattern=Pattern.compile("[a-zA-Z]*");
    System.out.println("Enter Account number: ");
    long accountNumber = input.nextLong();
    String ConvertAccountNumber=String.valueOf(accountNumber);
    if(!(Pattern.matches("[a-zA-Z]",ConvertAccountNumber)))
    {
        Iterator<UserDetails> iterator = UserDetailSet.iterator();
        UserDetails userdetails;
        while(iterator.hasNext())
        {
            userdetails = (UserDetails) iterator.next();
            if(userdetails.getAccountnumber()== accountNumber)
            {
                Depositeflag = 1;
                System.out.println("Enter Deposit amount: ");
                int depositAmount = input.nextInt();
                userdetails.setBalanceamount(userdetails.getBalanceamount()+depositAmount);
                System.out.println("Successfully money deposited to your account number "+userdetails.getAccountnumber()+".\n");
                History history = new History();
                history.CreditAmount = depositAmount;
                history.TotalAmount = userdetails.getBalanceamount();
                if(userdetails.TransactionHistory.size()>=5)
                {
                    userdetails.TransactionHistory.remove();
                    userdetails.TransactionHistory.add(history);
                }
                else
                {
                    userdetails.TransactionHistory.add(history);
                }
                break;
            }
        }
        if(Depositeflag == 0)
        {
            System.out.println("Account Number Not Created.\n");
        }
    }
    else
    {
        System.out.println("You're enter the invalid Account Number.\n");
    }
}
}
