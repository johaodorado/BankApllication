package bankapplication;

public interface UserDetailsService {
    void addUser(UserDetails userDetails);
    UserDetails getUser(long accountNumber);
}

// Clase UserDetails para almacenar detalles del usuario