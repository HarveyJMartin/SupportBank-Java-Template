package training.supportbank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PersonalAccount {
    public void personalAccount() throws IOException {
        BufferedReader csvReader = new BufferedReader(
                new FileReader("D:\\BP\\CodeBootCamp\\REPO\\SupportBank\\Transactions2014.csv"));
        String row;
        csvReader.readLine();
        while ((row = csvReader.readLine()) != null) {
            String[] part = row.split(",");
            Transaction transaction = new Transaction(part[0], part[1], part[2], part[3], 0);
        }
    }
}
