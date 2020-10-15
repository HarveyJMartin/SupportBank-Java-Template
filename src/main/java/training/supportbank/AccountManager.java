package training.supportbank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    private List<Account> accountStore = new ArrayList<>();

    public List<Account> getAccountStore() {
        return accountStore;
    }

    public void readAccountData() throws IOException {
        BufferedReader csvReader = new BufferedReader(
                new FileReader("D:\\BP\\CodeBootCamp\\REPO\\SupportBank\\People.csv"));
        String row;
        csvReader.readLine();
        while ((row = csvReader.readLine()) != null) {
            String[] name = row.split(",");
            Account account = new Account(name[0], 0);
            accountStore.add(account);
        }
        csvReader.close();
    }

    public void printAllBalances() {
        for (int i = 0; i < accountStore.size(); i++) {
            Account account = accountStore.get(i);
            System.out.println(account.getName() + ", £" + account.getBalance());
        }

    }

    public Account getAccount(String accountName) {
        for (int i = 0; i < accountStore.size(); i++) {
            Account account = accountStore.get(i);
            if (accountName.equals(account.getName())){
                return account;
            }
            
        }
       
        return null;
        
    }
}
