package bankapplication;

public class ScannerInputReader implements InputReader {
    private Scanner scanner;

    public ScannerInputReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readInput() {
        return scanner.nextLine();
    }
}