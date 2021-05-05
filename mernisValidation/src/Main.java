import abstract_.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(new Customer(1,
                "�sim",
                "Soyisim",
                "do�um y�l�",
                "tc no"));
    }
}
