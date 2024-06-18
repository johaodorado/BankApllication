package bankapplication;

public class CreateNewBankAccountCommand implements BankCommand {
    private BankingOperation bankingOperation;

    public CreateNewBankAccountCommand(BankingOperation bankingOperation) {
        this.bankingOperation = bankingOperation;
    }

    @Override
    public void execute() {
        bankingOperation.CreateNewBankAccount();
    }
}