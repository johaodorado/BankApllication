package bankapplication;

public class DepositUserMoneyCommand implements BankCommand {
    private BankingOperation bankingOperation;

    public DepositUserMoneyCommand(BankingOperation bankingOperation) {
        this.bankingOperation = bankingOperation;
    }

    @Override
    public void execute() {
        bankingOperation.DepositeUserMoney();
    }
}
