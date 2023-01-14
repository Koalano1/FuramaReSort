package Models.Services.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        int result = c1.getName().compareTo(c2.getName());
        if (result == 0) {
            result = c1.getDateOfBirth().compareTo(c2.getDateOfBirth());
        }
        return result;
    }
}
