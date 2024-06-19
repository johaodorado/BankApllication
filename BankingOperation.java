/*
@Banking application - With the help of this application we can create new bank 
account and other banking operation's.
@Author      - Nitheesh G.
@Created at  - 02-11-2021
@Updated at  - 02-16-2021
@Reviewed by - Anto
*/
package bankapplication;

import static java.lang.System.exit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BankingOperation implements Transaction {
    private final InputReader inputReader;

    public BankingOperation(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public void createNewBankAccount() {
        UserDetails userDetails = new UserDetails();
        System.out.println("---------------Enter Your Details------------------");

        // Código de validación y creación de cuenta omitido por brevedad
        // Utiliza input para obtener datos y userDetailsService para guardar detalles de usuario
    }

    @Override
    public void depositUserMoney() {
        // Implementación de depósito utilizando userDetailsService
    }

    @Override
    public void withdrawUserMoney() {
        // Implementación de retiro utilizando userDetailsService
    }

    @Override
    public void displayUserAccountDetails() {
        // Implementación de mostrar detalles de cuenta utilizando userDetailsService
    }
}