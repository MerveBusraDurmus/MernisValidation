package eCommerce.core.Utils;

import eCommerce.entities.dtos.LoginDto;

public interface ExternalAuthService {
		void register(String email);
		boolean userExists(String email);
		void login(LoginDto dto);
}

