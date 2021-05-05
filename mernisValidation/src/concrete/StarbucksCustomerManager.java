package concrete;

import abstract_.BaseCustomerManager;
import abstract_.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if(customerCheckService.checkIfRealPerson(customer)){
            
             super.save(customer);
        }else{
            
            System.out.println("Starbucks Manager : Doðrulama hatasý.");
        }

    }
}