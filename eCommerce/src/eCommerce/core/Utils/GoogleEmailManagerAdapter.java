package eCommerce.core.Utils;

import eCommerce.core.EmailService;
import eCommerce.googleEmail.GoogleEmailManager;

public class GoogleEmailManagerAdapter implements EmailService {

	private GoogleEmailManager googleEmailManager;
	
	public GoogleEmailManagerAdapter(GoogleEmailManager googleEmailManager) {
		super();
		this.googleEmailManager = googleEmailManager;
	}
	@Override
	public void send(String email, String message) {
		googleEmailManager.send(email, message);
		
	}

}
