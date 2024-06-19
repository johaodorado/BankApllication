/*
@Banking application - With the help of this application we can create new bank 
account and other banking operation's.
@Author      - Nitheesh G.
@Created at  - 02-11-2021
@Updated at  - 02-16-2021
@Reviewed by - Anto
*/
package bankapplication;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class UserTransactionHistory {
    private UserDetailsRepository userRepository;

    public UserTransactionHistory(UserDetailsRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUserTransactionHistory(int accountNumber) {
        UserDetails userDetails = userRepository.getUserDetailsByAccountNumber(accountNumber);

        if (userDetails != null) {
            System.out.println("Credit | Debit | Total");
            for (History transaction : userDetails.getTransactionHistory()) {
                System.out.println(transaction.getCreditAmount() + " | " +
                        transaction.getDebitAmount() + " | " +
                        transaction.getTotalAmount());
            }
        } else {
            System.out.println("BankAccount Not Available");
        }
    }
}