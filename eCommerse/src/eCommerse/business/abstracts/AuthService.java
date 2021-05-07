package eCommerse.business.abstracts;

import eCommerse.entities.concretes.LoginDto;
import eCommerse.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto );
}
