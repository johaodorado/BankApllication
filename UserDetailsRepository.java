package bankapplication;

public interface UserDetailsRepository {
    UserDetails getUserDetailsByAccountNumber(int accountNumber);
}