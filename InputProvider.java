package bankapplication;

public interface InputProvider {
    String next();
    int nextInt();
    long nextLong();
    void close();
}

// Interfaz para operaciones con usuarios