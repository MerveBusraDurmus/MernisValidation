package adapters;

import java.rmi.RemoteException;

import abstract_.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniseServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()),
            		gamer.getFirstName().toUpperCase(),
            		gamer.getLastName().toUpperCase(), 
            		gamer.getBirthDate());
        }catch (NumberFormatException | RemoteException exception){
            exception.printStackTrace();
        }
        return result;
	}

}
