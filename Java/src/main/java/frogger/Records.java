package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<String[]> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param id The id of the Frogger
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID id) {

        String firstName = id.firstName();
        String lastName = id.lastName();
        String phoneNumber = id.phoneNumber();
        String zipCode = id.zipCode();
        String state = id.state();
        String gender = id.gender();

        for (String[] row : this.records) {
            if (row[0].equals(firstName)
                    && row[1].equals(lastName)
                    && row[2].equals(phoneNumber)
                    && row[3].equals(zipCode)
                    && row[4].equals(state)
                    && row[5].equals(gender)) {
                return false;
            }
        }
        this.records.add(
                new String[]{firstName, lastName, phoneNumber, zipCode, state, gender});
        return true;
    }
}