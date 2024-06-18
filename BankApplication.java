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
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        BankingOperation bankingOperation = new BankingOperation();
        UserInterest userInterest = new UserInterest();
        UserTransactionHistory userTransactionHistory = new UserTransactionHistory();

        Map<String, BankCommand> commands = new HashMap<>();
        commands.put("1", new CreateNewBankAccountCommand(bankingOperation));
        commands.put("2", new DepositUserMoneyCommand(bankingOperation));
        commands.put("3", new WithdrawUserMoneyCommand(bankingOperation));
        // Agregar otros comandos de manera similar...

        System.out.println("Welcome to the Nitheesh's online banking service's :");

        while (true) {
            try {
                System.out.println("Enter the option for Banking operation");
                System.out.println("1.Create new Bank Account");
                System.out.println("2.Deposit Your Amount");
                System.out.println("3.Withdraw Your Amount");
                System.out.println("4.To calculate Interest Amount for your Loan");
                System.out.println("5.To view Your Account Details");
                System.out.println("6.To view your Transaction History");
                System.out.println("7.Exit the Banking operation");

                String userChoice = input.next();

                if (userChoice.equals("7")) {
                    System.out.println("************ Thank you for using our service! Have a GREAT DAY **************");
                    break;
                }

                BankCommand command = commands.get(userChoice);

                if (command != null) {
                    command.execute();
                } else {
                    throw new InValidInputException("Please Enter the correct choice.\n");
                }
            } catch (InValidInputException e) {
                System.out.println("You entered an invalid choice.\n" + e);
            }
        }
    }
}