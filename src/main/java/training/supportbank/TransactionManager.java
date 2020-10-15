package training.supportbank;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private AccountManager accountManagerLocal;
    private List<Transaction> transactionStore = new ArrayList<>();

    public TransactionManager(AccountManager accountManager) {
        accountManagerLocal = accountManager;
    }

	public void readTransactionData() throws IOException {
        BufferedReader csvReader = new BufferedReader(
                new FileReader("D:\\BP\\CodeBootCamp\\REPO\\SupportBank\\Transactions2014.csv"));
        String row;
        csvReader.readLine();
        while ((row = csvReader.readLine()) != null) {
            String[] part = row.split(",");
            Transaction transaction = new Transaction(part[0], part[1], part[2], part[3], 0);
            double amount = Double.parseDouble(part[4]);
            Account accountTo = accountManagerLocal.getAccount(part[2]); 
            Account accountFrom = accountManagerLocal.getAccount(part[1]); 
            List<Account> accountStoreLocal = accountManagerLocal.getAccountStore();
            accountTo.setBalance(accountTo.getBalance() + amount);
            accountFrom.setBalance(accountFrom.getBalance() - amount);
            transactionStore.add(transaction);
            
        }
        csvReader.close();
    }
    
        
}

