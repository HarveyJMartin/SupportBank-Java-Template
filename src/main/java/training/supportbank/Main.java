package training.supportbank;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {

        AccountManager accountManager = new AccountManager();
            accountManager.readAccountData();
        

        TransactionManager transactionManager = new TransactionManager(accountManager);
            transactionManager.readTransactionData();
            accountManager.printAllBalances();

        
    }
}
