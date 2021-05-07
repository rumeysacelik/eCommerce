package eCommerse.core;

import eCommerse.googleEmail.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailService {
	private GoogleMailManager googleMailManager;
	
	public GoogleMailManagerAdapter() {
		googleMailManager = new GoogleMailManager();
	}

	@Override
	public void send(String email, String message) {		
		googleMailManager.send(email, message);
	}
}