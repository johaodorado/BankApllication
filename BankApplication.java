/*
@Banking application - With the help of this application we can create new bank 
account and other banking operation's.
@Author      - Nitheesh G.
@Created at  - 02-11-2021
@Updated at  - 02-16-2021
@Reviewed by - Anto
*/
package bankapplication;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        InputReader inputReader = new ScannerInputReader();
        BankingOperation bankingOperation = new BankingOperation(inputReader);

        System.out.println("Welcome to the banking application.");
        bankingOperation.performOperation();
    }
}