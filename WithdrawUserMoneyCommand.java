package bankapplication;

public class WithdrawUserMoneyCommand implements BankCommand {
    private BankingOperation bankingOperation;

    public WithdrawUserMoneyCommand(BankingOperation bankingOperation) {
        this.bankingOperation = bankingOperation;
    }

    @Override
    public void execute() {
        bankingOperation.WithdrawUserMoney();
    }
}