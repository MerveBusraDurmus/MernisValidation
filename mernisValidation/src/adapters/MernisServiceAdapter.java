package adapters;

import java.rmi.RemoteException;

import abstract_.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), Integer.parseInt(customer.getDateOfBirth()));
        }catch (NumberFormatException | RemoteException exception){
            exception.printStackTrace();
        }
        return result;
    }
}